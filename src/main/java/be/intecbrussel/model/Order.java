package be.intecbrussel.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "order_number") private String orderNr;
    @Column(name = "order_client") private String orderClient;
    @Column(name = "order_delivery_address") private String deliveryAddress;
    @Column(name = "order_delivery_postalcode") private int deliveryPostal;
    @Column(name = "order_delivery_city") private String deliveryCity;
    @Column(name = "is_vat_free") private boolean vatFree;
    @Column(name = "is_send") private boolean isSent;
    @Column(name = "order_date") private Date orderDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(String orderNr) {
        this.orderNr = orderNr;
    }

    public String getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(String orderClient) {
        this.orderClient = orderClient;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getDeliveryPostal() {
        return deliveryPostal;
    }

    public void setDeliveryPostal(int deliveryPostal) {
        this.deliveryPostal = deliveryPostal;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public boolean isVatFree() {
        return vatFree;
    }

    public void setVatFree(boolean vatFree) {
        this.vatFree = vatFree;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNr='" + orderNr + '\'' +
                ", orderClient='" + orderClient + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryPostal=" + deliveryPostal +
                ", deliveryCity='" + deliveryCity + '\'' +
                ", vatFree=" + vatFree +
                ", isSent=" + isSent +
                ", orderDate=" + orderDate +
                '}';
    }
}
