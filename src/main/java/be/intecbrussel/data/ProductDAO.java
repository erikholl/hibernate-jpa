package be.intecbrussel.data;

import be.intecbrussel.model.Product;

import javax.persistence.EntityManager;

public class ProductDAO {
    private EntityManager entityManager;

    public ProductDAO() {
        this.entityManager = EntityMgr.getEntityManager();
    }

    public void addProduct(Product product) {
        entityManager.persist(product);
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
//        flushAndClear();
    }

    public Product findProduct(int id) {
        return entityManager.find(Product.class, id);
        //        flushAndClear();
    }

    public Product updateProduct(Product p) {
        return entityManager.merge(p);
        //        flushAndClear();
    }

    // TODO: read more
    private void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }

    public void deleteProduct(Product product) {
        entityManager.remove(product);
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
//        flushAndClear();
    }
}
