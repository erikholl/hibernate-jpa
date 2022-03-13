package be.intecbrussel.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_products")
public class Product {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "product_name")
    private String productName;

    private int amount;

    @Column (name = "price_per_unit")
    private BigDecimal pricePerUnit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
