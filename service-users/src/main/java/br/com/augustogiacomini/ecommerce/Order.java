package br.com.augustogiacomini.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String orderId, email;
    private final BigDecimal amount;

    public Order(String userId, String orderId, String email, BigDecimal amount) {
        this.orderId = orderId;
        this.email = email;
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }
}
