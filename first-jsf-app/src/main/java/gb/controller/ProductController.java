package gb.controller;

import gb.persist.*;
import gb.service.ProductRepr;
import gb.service.ProductService;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class ProductController implements Serializable {

    @EJB
    private ProductService productService;

    @EJB
    private CategoryRepository categoryRepository;

    @EJB
    private BrandRepository brandRepository;

    private ProductRepr productRepr;

    public ProductRepr getProduct() {
        return productRepr;
    }

    public void setProduct(ProductRepr productRepr) {
        this.productRepr = productRepr;
    }

    public List <ProductRepr> getAllProducts() {
        return productService.findAll();
    }

    public String editProduct(ProductRepr productRepr){
        this.productRepr = productRepr;
        return "/product.xhtml?faces-redirect=true";
    }

    public void deleteProduct (ProductRepr productRepr) {
        productService.delete(productRepr.getId());
    }

    public String createProduct() {
        this.productRepr = new ProductRepr();
        return "/product.xhtml?faces-redirect=true";
    }

    public String saveProduct() {
        if (productRepr.getId()!= null){
            productService.update(productRepr);
        } else {
            productService.insert(productRepr);
        }
        return "/index.xhtml?faces-redirect=true";
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    };

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    };
}
