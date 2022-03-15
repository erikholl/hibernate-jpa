package be.intecbrussel.view;

import be.intecbrussel.data.EntityMgr;
import be.intecbrussel.model.Order;
import be.intecbrussel.model.Product;
import net.bytebuddy.asm.Advice;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class OrderProductMain {
	public static void main(String[] args) {
		// CRUD: create, read, update, delete
		int userInputId = 21; // used for methods that use an id as input

		EntityManager em = EntityMgr.getEntityManager();
		em.getTransaction().begin();

		System.out.println("CREATE ORDER WITH MULTIPLE PRODUCTS");
//		Order order = new Order();
//		order.setOrderNr("ORD-202203-0002");
//		order.setOrderClient("Ben");
//		order.setDeliveryAddress("Boomgaardes 4");
//		order.setDeliveryPostal(5678);
//		order.setDeliveryCity("Duindorp");
//		order.setVatFree(true);
//		order.setSent(true);
//		order.setOrderDate(Date.valueOf(LocalDate.now()));
//
//		Product p1 = new Product();
//		p1.setOrder(order);
//		p1.setProductName("can with soup");
//		p1.setAmount(2);
//		p1.setPricePerUnit(new BigDecimal(2.89));
//
//		Product p2 = new Product();
//		p2.setOrder(order);
//		p2.setProductName("baguette");
//		p2.setAmount(1);
//		p2.setPricePerUnit(new BigDecimal(1.99)); // special baguette
//
//		Product p3 = new Product();
//		p3.setOrder(order);
//		p3.setProductName("tomato");
//		p3.setAmount(5);
//		p3.setPricePerUnit(new BigDecimal(0.40));
//
//		Product p4 = new Product();
//		p4.setOrder(order);
//		p4.setProductName("200 grams of mozarella");
//		p4.setAmount(1);
//		p4.setPricePerUnit(new BigDecimal(2.99));
//
//		em.persist(order);
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.persist(p4);

		System.out.println("READ ORDER INCL. PRODUCTS");
		Order existingOrder = em.find(Order.class, userInputId);
		System.out.println(existingOrder);

		System.out.println("UPDATE ORDER ATTRIBUTE");
//		Order orderToUpdate = em.find(Order.class, userInputId);
//		if (orderToUpdate == null) {
//			System.out.println("order does not exist");
//		} else {
//			orderToUpdate.setDeliveryAddress("Struikgewas 21");
//			System.out.println("Address of order with orderId "
//									   + orderToUpdate.getId() +
//									   " is updated to: "
//									   + orderToUpdate.getDeliveryAddress());
//		}
		System.out.println("UPDATE PRODUCT LINE IN AN ORDER");
		Product productToUpdate = em.find(Product.class, userInputId);
		if (productToUpdate == null) {
			System.out.println("product with id " + userInputId + " does not " +
									   "exist");
		} else {
			productToUpdate.setPricePerUnit(new BigDecimal(0.45));
			System.out.println("Price per unit of product with productId "
									   + productToUpdate.getId() +
									   " (" + productToUpdate.getProductName()
									   + ") is updated to "
									   + productToUpdate.getPricePerUnit() +".");
		}

		em.getTransaction().commit();
		em.close();

	}
}
