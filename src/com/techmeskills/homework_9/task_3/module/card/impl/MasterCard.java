package com.techmeskills.homework_9.task_3.module.card.impl;

import com.techmeskills.homework_9.task_3.module.card.BaseCard;

public class MasterCard extends BaseCard {

    public MasterCard(long id, String cardNumber, int cvc, double amount, double limit, String currency) {
        super(id, cardNumber, cvc, amount, limit, currency);
    }
}
