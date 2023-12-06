package com.techmeskills.homework_9.task_3.module.card;

public abstract class BaseCard {

    private long id;
    private String cardNumber;
    private int cvc;
    private double amount;
    private double limit;
    private String currency;

    public BaseCard(long id, String cardNumber, int cvc, double amount, double limit, String currency) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.amount = amount;
        this.limit = limit;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
