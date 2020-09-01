package gb.persist;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;
import java.util.List;
import java.util.Optional;

@Stateless
public class BrandRepository {

    private static final Logger logger = LoggerFactory.getLogger(BrandRepository.class);

    @PersistenceContext(unitName = "ds")
    private EntityManager em;

    public BrandRepository(){
    }

    @TransactionAttribute
    public void insert(Brand brand) {
        em.persist(brand);

    }

    @TransactionAttribute
    public void update(Brand brand){
        em.merge(brand);
    }

    @TransactionAttribute
    public void delete(long id) {
        Brand brand = em.find(Brand.class, id );
        if (brand != null){
            em.remove(brand);
        }
    }

    public Optional<Brand> findById(long id) {
        Brand brand = em.find(Brand.class, id );
        if (brand != null){
            return Optional.of(brand);
        }
        return Optional.empty();
    }

    public List<Brand> findAll() {
        return em.createQuery("from Brand ", Brand.class).getResultList();
    }

    public Optional<Brand> findByName(String name) {
        Brand brand = em.createQuery("from Brand c where c.name = :name", Brand.class)
                .setParameter("name", name)
                .getSingleResult();
        if (brand != null) {
            return Optional.of(brand);
        } else {
            return Optional.empty();
        }
    }
}
