package be.intecbrussel.data;

import be.intecbrussel.model.Product;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class ProductDAO {
    private EntityManager em;

    public ProductDAO() {
        this.em = EntityMgr.getEntityManager();
    }

    public void addProduct(Product product) {
        em.persist(product);
        em.getTransaction().begin();
        em.getTransaction().commit();
//        flushAndClear();
    }

    public Product findProduct(int id) {
        return em.find(Product.class, id);
        //        flushAndClear();
    }

    public Product updateProduct(Product p) {
        return em.merge(p);
        //        flushAndClear();
    }

    // TODO: read more
    private void flushAndClear() {
        em.flush();
        em.clear();
    }

    public void deleteProduct(Product product) {
        em.remove(product);
        em.getTransaction().begin();
        em.getTransaction().commit();
//        flushAndClear();
    }
}
