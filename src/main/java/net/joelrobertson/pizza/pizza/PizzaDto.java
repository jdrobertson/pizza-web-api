package net.joelrobertson.pizza.pizza;

import net.joelrobertson.pizza.pizzabasesize.PizzaBaseSizeDto;
import net.joelrobertson.pizza.pizzatopping.PizzaToppingDto;

import java.io.Serializable;

public class PizzaDto implements Serializable {
    private final Long id;
    private final PizzaBaseSizeDto pizzaBaseSize;
    private final PizzaToppingDto pizzaTopping;

    public PizzaDto(Long id, PizzaBaseSizeDto pizzaBaseSize, PizzaToppingDto pizzaTopping) {
        this.id = id;
        this.pizzaBaseSize = pizzaBaseSize;
        this.pizzaTopping = pizzaTopping;
    }

    public Long getId() {
        return id;
    }

    public PizzaBaseSizeDto getPizzaBaseSize() {
        return pizzaBaseSize;
    }

    public PizzaToppingDto getPizzaTopping() {
        return pizzaTopping;
    }
}
