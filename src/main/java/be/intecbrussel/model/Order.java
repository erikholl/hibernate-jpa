package be.intecbrussel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Order {
    @Id
//    @GeneratedValue
    private int id;
    private String order_number;
    private String order_client;
    private String order_delivery_address;
    private int order_delivery_postalcode;
    private String order_delivery_city;
    private boolean is_vat_free;
    private boolean is_send;
    private Date order_date;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String orderNr) {
        this.order_number = orderNr;
    }

    public String getOrder_client() {
        return order_client;
    }

    public void setOrder_client(String client) {
        this.order_client = client;
    }

    public String getOrder_delivery_address() {
        return order_delivery_address;
    }

    public void setOrder_delivery_address(String deliveryAddress) {
        this.order_delivery_address = deliveryAddress;
    }

    public int getOrder_delivery_postalcode() {
        return order_delivery_postalcode;
    }

    public void setOrder_delivery_postalcode(int deliveryPostal) {
        this.order_delivery_postalcode = deliveryPostal;
    }

    public String getOrder_delivery_city() {
        return order_delivery_city;
    }

    public void setOrder_delivery_city(String deliveryCity) {
        this.order_delivery_city = deliveryCity;
    }

    public boolean isIs_vat_free() {
        return is_vat_free;
    }

    public void setIs_vat_free(boolean is_vat_free) {
        this.is_vat_free = is_vat_free;
    }

    public boolean isIs_send() {
        return is_send;
    }

    public void setIs_send(boolean is_send) {
        this.is_send = is_send;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date orderDate) {
        this.order_date = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNr='" + order_number + '\'' +
                ", client='" + order_client + '\'' +
                ", deliveryAddress='" + order_delivery_address + '\'' +
                ", deliveryPostal=" + order_delivery_postalcode +
                ", deliveryCity='" + order_delivery_city + '\'' +
                ", isVatFree=" + is_vat_free +
                ", isSent=" + is_send +
                ", orderDate=" + order_date +
                '}';
    }
}
