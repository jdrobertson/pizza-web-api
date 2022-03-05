package net.joelrobertson.pizza.pizza;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.joelrobertson.pizza.customerorder.CustomerOrder;
import net.joelrobertson.pizza.pizzabasesize.PizzaBaseSize;
import net.joelrobertson.pizza.pizzatopping.PizzaTopping;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
public class Pizza extends AbstractPersistable<Long> {

    @ManyToOne
    @JsonBackReference
    private CustomerOrder customerOrder;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private PizzaBaseSize pizzaBaseSize;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private PizzaTopping pizzaTopping;

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public PizzaBaseSize getPizzaBaseSize() {
        return pizzaBaseSize;
    }

    public void setPizzaBaseSize(PizzaBaseSize pizzaBaseSize) {
        this.pizzaBaseSize = pizzaBaseSize;
    }

    public PizzaTopping getPizzaTopping() {
        return pizzaTopping;
    }

    public void setPizzaTopping(PizzaTopping pizzaTopping) {
        this.pizzaTopping = pizzaTopping;
    }

}