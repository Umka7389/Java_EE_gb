package gb.controller;


import gb.service.CartService;
import gb.service.ProductRepr;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@RequestScoped
@Named
public class CartController implements Serializable {

    @EJB
    private CartService cartService;


    public List<ProductRepr> getAllProducts(){
        return cartService.getAll();
    }

    public void addToCart(ProductRepr productRepr) {
        cartService.add(productRepr);
    }

    public void deleteFromCart (ProductRepr productRepr) {
        cartService.delete(productRepr);
    }

}
