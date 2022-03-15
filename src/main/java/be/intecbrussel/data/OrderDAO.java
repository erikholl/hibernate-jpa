package be.intecbrussel.data;

import be.intecbrussel.model.Order;

import javax.persistence.EntityManager;
import java.util.List;

public class OrderDAO {
    private EntityManager em;

    public OrderDAO() {
        this.em = EntityMgr.getEntityManager();
    }

    public Order addOrder(Order order) {
        em.persist(order); // read more about the order

        em.getTransaction().begin();
        em.getTransaction().commit();

        return order;
    }

    public Order getOrderById(int id) {

        return null;
    }

    public List<Order> getAllOrders() {

        return List.of();
    }

    public Order updateOrder() {
        // em.merge(order)
        return null;
    }

    public Order deleteOrder() {

        return null;
    }
}
