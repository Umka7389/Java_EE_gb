package gb.service;


import gb.persist.*;
import gb.rest.ProductServiceRs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.jws.WebService;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@WebService(endpointInterface = "gb.service.ProductServiceWs", serviceName = "ProductService")
@Stateless
public class ProductServiceImpl implements ProductService, ProductServiceWs, ProductServiceRs {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @EJB
    private ProductRepository productRepository;

    @EJB
    private CategoryRepository categoryRepository;

    @EJB
    private BrandRepository brandRepository;

    @TransactionAttribute
    @Override
    public void insert(ProductRepr productRepr) {
        Category category = categoryRepository.findById(productRepr.getCategoryId()).orElse(null);
        Brand brand = brandRepository.findById(productRepr.getBrandId()).orElse(null);
        Product product = new Product(productRepr.getId(),
                productRepr.getName(),
                productRepr.getDescription(),
                productRepr.getPrice(),
                category,
                brand);
        productRepository.insert(product);
    }

    @TransactionAttribute
    @Override
    public void update(ProductRepr productRepr) {
        Category category = categoryRepository.findById(productRepr.getCategoryId()).orElse(null);
        Brand brand = brandRepository.findById(productRepr.getBrandId()).orElse(null);
        Product product = new Product(productRepr.getId(),
                productRepr.getName(),
                productRepr.getDescription(),
                productRepr.getPrice(),
                category,
                brand);
        productRepository.update(product);
    }

    @TransactionAttribute
    @Override
    public void delete(long id) {
        productRepository.delete(id);

    }

    @Override
    public Optional<ProductRepr> findById(long id) {
        return productRepository.findById(id).
                map(ProductRepr::new);
    }

    @Override
    public ProductRepr findByIdWS(long id) {
        return findById(id).get();
    }




    @Override
    public List<ProductRepr> findAll() {
        return productRepository.findAll().stream()
                .map(new Function<Product, ProductRepr>() {
                    @Override
                    public ProductRepr apply(Product product) {
                        return new ProductRepr(product);
                    }
                })
                .collect(Collectors.toList());
    }

    @Override
    public ProductRepr findByIdRs(long id) {
        return findById(id).get();
    }

    public List<ProductRepr> findAllByCategory() {
        return productRepository.findAll().stream()
                .map(new Function<Product, ProductRepr>() {
                    @Override
                    public ProductRepr apply(Product product) {
                        return new ProductRepr(product);
                    }
                })
                .collect(Collectors.toList());
    }


}
