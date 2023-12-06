package com.techmeskills.homework_9.task_3.service;

import com.techmeskills.homework_9.task_3.module.card.BaseCard;
import com.techmeskills.homework_9.task_3.module.card.impl.BelCard;
import com.techmeskills.homework_9.task_3.module.card.impl.MasterCard;
import com.techmeskills.homework_9.task_3.module.card.impl.VisaCard;

public class CardTransferService {

    public void doTransfer(BaseCard fromCard, BaseCard toCard, double amountToTransfer) {

        System.out.println("Card From. Before transfer: " + fromCard.getCardNumber() + "->" + fromCard.getAmount());
        System.out.println("Card To. Before transfer: " + fromCard.getCardNumber() + "->" + fromCard.getAmount());

//        правильная ли реализация проверки и вызов методов в проверки,НЕ знаю как  конверсии или нужно создавать отдельный класс конверсии?
        if (fromCard.getAmount() > 0 && amountToTransfer <= fromCard.getLimit()) {
                double balanceCardFrom = (fromCard.getAmount() - amountToTransfer-Conversion.doConversion());
            fromCard.setAmount(balanceCardFrom);

        }

    }
}
