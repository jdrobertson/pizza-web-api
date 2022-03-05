package net.joelrobertson.pizza.customerorder;

import net.joelrobertson.pizza.pizza.PizzaDto;

import java.io.Serializable;
import java.util.List;

public class CustomerOrderDto implements Serializable {
    private final Long id;
    private final String customerName;
    private final String customerAddress;
    private final List<PizzaDto> pizzas;
    private final Boolean fulfilled;

    public CustomerOrderDto(Long id, String customerName, String customerAddress, List<PizzaDto> pizzas, Boolean fulfilled) {
        this.id = id;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.pizzas = pizzas;
        this.fulfilled = fulfilled;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public Boolean getFulfilled() {
        return fulfilled;
    }
}
