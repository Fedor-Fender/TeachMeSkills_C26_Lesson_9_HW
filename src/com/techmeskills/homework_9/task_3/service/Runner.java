package com.techmeskills.homework_9.task_3.service;

import com.techmeskills.homework_9.task_3.module.address.Address;
import com.techmeskills.homework_9.task_3.module.card.BaseCard;
import com.techmeskills.homework_9.task_3.module.card.impl.BelCard;
import com.techmeskills.homework_9.task_3.module.card.impl.MasterCard;
import com.techmeskills.homework_9.task_3.module.card.impl.VisaCard;
import com.techmeskills.homework_9.task_3.module.client.Client;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        BaseCard cart1 = new BelCard(3, "wq3", 908, 500, 80, "BYN");
        BaseCard cart2 = new VisaCard(4, "ECEA", 908, 500, 80, "USD");
        BaseCard card3 = new MasterCard(6, "FWFEW", 905, 800, 80, "USD");

        BaseCard[] cards=new BaseCard[]{cart1, cart2, card3};

        Address address = new Address("st1245", 4579, "Vitebsk", "Shagal's street");

        Client client=new Client("Fedor","BY1994","24/06/1995", address,cards);

        CardTransferService.doTransfer()// здесь не выполняется т.к не до конца логика реализована в классе
    }
}
