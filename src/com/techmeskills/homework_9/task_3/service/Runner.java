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

        Client client=new Client("Fedor","BY1994","24/06/1995", "Vitebsk",4);// идея подчеркивает адрес и карты красным,что-то не правильно ввожу
    }
}
