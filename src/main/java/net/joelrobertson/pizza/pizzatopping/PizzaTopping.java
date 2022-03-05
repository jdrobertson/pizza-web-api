package net.joelrobertson.pizza.pizzatopping;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
public class PizzaTopping extends AbstractPersistable<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaToppingDto asDto() {
        return new PizzaToppingDto(
            getId(),
            getName()
        );
    }
}