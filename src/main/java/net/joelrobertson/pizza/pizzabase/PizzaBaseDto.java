package net.joelrobertson.pizza.pizzabase;

import net.joelrobertson.pizza.pizzabasesize.PizzaBaseSizeDto;

import java.io.Serializable;
import java.util.List;

public class PizzaBaseDto implements Serializable {
    private final Long id;
    private final String name;
    private final List<PizzaBaseSizeDto> pizzaBaseSizes;

    public PizzaBaseDto(Long id, String name, List<PizzaBaseSizeDto> pizzaBaseSizes) {
        this.id = id;
        this.name = name;
        this.pizzaBaseSizes = pizzaBaseSizes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PizzaBaseSizeDto> getPizzaBaseSizes() {
        return pizzaBaseSizes;
    }
}
