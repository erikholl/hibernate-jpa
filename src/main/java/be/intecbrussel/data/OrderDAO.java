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
        // .begin signals to the DB the start of a transaction.
        // a transaction is a bundle of DB instructions executed as 1 whole. Eg:
        // bank account 1: 1000
        // bank account 2: 1000
        // 1 borrowed 50 from 2 >>
        // UPDATE 1 950
        // UPDATE 2 1050

        em.getTransaction().commit();
        // .commit signals all instructions part of the transaction, to the DB.

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
