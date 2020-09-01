package gb.persist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Stateless
public class ProductRepository {

    private static final Logger logger = LoggerFactory.getLogger(ProductRepository.class);

    @PersistenceContext(unitName = "ds")
    private EntityManager em;

    @EJB
    private CategoryRepository categoryRepository;

    @Inject
    private BrandRepository brandRepository;

    public ProductRepository(){
    }


    public void insert(Product product) {
        em.persist(product);

    }

    public void update(Product product){
        em.merge(product);
    }

    public void delete(long id) {
        Product product = em.find(Product.class, id );
        if (product != null){
            em.remove(product);
        }
    }

    public Optional<Product> findById(long id) {
        Product product = em.find(Product.class, id );
        if (product != null){
            return Optional.of(product);
        }
        return Optional.empty();
    }

    public List<Product> findAll() {
        return em.createQuery("from Product ", Product.class).getResultList();
    }

}
