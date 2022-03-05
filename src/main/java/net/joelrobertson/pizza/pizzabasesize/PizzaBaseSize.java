package net.joelrobertson.pizza.pizzabasesize;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.joelrobertson.pizza.pizzabase.PizzaBase;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PizzaBaseSize extends AbstractPersistable<Long> {

    private String name;

    private Integer inches;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    @JsonBackReference
    private PizzaBase pizzaBase;

    public PizzaBase getPizzaBase() {
        return pizzaBase;
    }

    public void setPizzaBase(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInches() {
        return inches;
    }

    public void setInches(Integer inches) {
        this.inches = inches;
    }

    public PizzaBaseSizeDto asDto() {
        return new PizzaBaseSizeDto(
            getId(),
            getName(),
            getInches(),
            getPizzaBase().asDto()
        );
    }
}