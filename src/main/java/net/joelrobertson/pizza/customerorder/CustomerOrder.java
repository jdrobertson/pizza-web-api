package net.joelrobertson.pizza.customerorder;

import javax.persistence.*;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue
    private Long id;

    private String customerName;

    private String customerAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}