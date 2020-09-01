package gb.service;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class CartServiceImpl implements CartService, Serializable {

    public CartServiceImpl() {
    }

    private static List <ProductRepr> productReprList = new ArrayList<>();

    @Override
    public void add(ProductRepr productRepr) {
        productReprList.add(productRepr);
    }

    @Override
    public void delete(ProductRepr productRepr) {
        for (int i = 0; i < productReprList.size(); i++){
            if(productRepr.getId() == productReprList.get(i).getId()){
                productReprList.remove(i);
            }
        }
    }

    @Override
    public List<ProductRepr> getAll() {
        return productReprList;
    }

}
