package be.intecbrussel.data;

import be.intecbrussel.model.Order;

import javax.persistence.EntityManager;

public class OrderDAO {
    private EntityManager em;

    public OrderDAO() {
        this.em = EntityMgr.getEntityManager();
    }

    public void addOrder(Order o) {
        em.persist(o);
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
