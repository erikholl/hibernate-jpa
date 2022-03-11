package be.intecbrussel.service;

import be.intecbrussel.data.OrderDAO;
import be.intecbrussel.model.Order;

public class OrderService {
    private OrderDAO orderDao;

    public OrderService() {
        this.orderDao = new OrderDAO();
    }

    public Order addOrder(Order o) {
        orderDao.addOrder(o);
        return o;
    }
}
