import gb.service.ProductRepr;
import gb.service.ProductService;
import gb.service.ProductServiceWs;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/first-jsf-app/ProductService/ProductServiceImpl?wsdl");
        ProductService productService = new ProductService(url);
        ProductServiceWs port = productService.getProductServiceImplPort();

        ProductRepr product = new ProductRepr();
        product.setName("smth new");
        product.setDescription("test add");
        product.setPrice(new BigDecimal(3000));
        product.setBrandId(1L);
        product.setCategoryId(1L);

        port.delete(9);

        port.insert(product);

        product.setId(10L);

        product.setName("change");
        port.update(product);

        port.findAll().forEach(todo -> System.out.println(todo.getId() + ":" + todo.getName()+"/"+todo.getCategoryName()+"/"+todo.getBrandName()));

        ProductRepr productFindId = port.findByIdWS(1L);
        System.out.println(productFindId.getId()+":"+productFindId.getName()+"/"+productFindId.getCategoryName()+"/"+productFindId.getBrandName());

    }
}
