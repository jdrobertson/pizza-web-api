package net.joelrobertson.pizza.pizza;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.joelrobertson.pizza.customerorder.CustomerOrder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
public class Pizza extends AbstractPersistable<Long> {

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerOrder customerOrder;

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