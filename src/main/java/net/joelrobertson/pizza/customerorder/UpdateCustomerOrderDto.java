package net.joelrobertson.pizza.customerorder;

import java.io.Serializable;

public class UpdateCustomerOrderDto implements Serializable {
    private Boolean fulfilled;

    public Boolean getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }
}
