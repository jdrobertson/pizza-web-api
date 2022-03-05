package net.joelrobertson.pizza.pizzabasesize;

import net.joelrobertson.pizza.pizzabase.PizzaBaseDto;

import java.io.Serializable;

public class PizzaBaseSizeDto implements Serializable {
    private final Long id;
    private final String name;
    private final Integer inches;
    private final PizzaBaseDto pizzaBase;

    public PizzaBaseSizeDto(Long id, String name, Integer inches, PizzaBaseDto pizzaBase) {
        this.id = id;
        this.name = name;
        this.inches = inches;
        this.pizzaBase = pizzaBase;
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

    public PizzaBaseDto getPizzaBase() {
        return pizzaBase;
    }
}
