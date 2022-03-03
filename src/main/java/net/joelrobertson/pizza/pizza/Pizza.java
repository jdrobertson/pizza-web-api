package net.joelrobertson.pizza.pizza;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.joelrobertson.pizza.customerorder.CustomerOrder;

import javax.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerOrder customerOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

}