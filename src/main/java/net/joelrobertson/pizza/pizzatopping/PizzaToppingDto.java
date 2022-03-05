package net.joelrobertson.pizza.pizzatopping;

import java.io.Serializable;

public class PizzaToppingDto implements Serializable {
    private final Long id;
    private final String name;

    public PizzaToppingDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
