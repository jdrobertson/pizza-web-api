package net.joelrobertson.pizza.customerorder;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.joelrobertson.pizza.pizza.Pizza;
import net.joelrobertson.pizza.pizza.PizzaDto;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class CustomerOrder extends AbstractPersistable<Long> {

    private String customerName;

    private String customerAddress;

    @OneToMany(mappedBy = "customerOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Pizza> pizzas = new ArrayList<>();

    private Boolean fulfilled = false;

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

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Boolean getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    public CustomerOrderDto asDto() {
        return new CustomerOrderDto(
            getId(),
            getCustomerName(),
            getCustomerAddress(),
            getPizzas().stream().map(pizza ->
                new PizzaDto(
                    pizza.getId(),
                    pizza.getPizzaBaseSize().asDto(),
                    pizza.getPizzaTopping().asDto()
                )
            ).collect(Collectors.toList()),
            getFulfilled()
        );
    }
}