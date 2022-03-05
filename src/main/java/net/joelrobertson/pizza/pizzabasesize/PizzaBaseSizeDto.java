package net.joelrobertson.pizza.pizzabasesize;

import java.io.Serializable;

public class PizzaBaseSizeDto implements Serializable {
    private final Long id;
    private final String name;
    private final Integer inches;

    public PizzaBaseSizeDto(Long id, String name, Integer inches) {
        this.id = id;
        this.name = name;
        this.inches = inches;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getInches() {
        return inches;
    }
}
