package com.techmeskills.homework_9.task_3.module.card;

import com.techmeskills.homework_9.task_3.module.card.impl.BelCard;
import com.techmeskills.homework_9.task_3.module.card.impl.MasterCard;
import com.techmeskills.homework_9.task_3.module.card.impl.VisaCard;

public class CardFabric {

    public static BaseCard createCard(int someCard) {
// создание карт,здесь все понятно
        BaseCard baseCard;
        if (someCard == 1) {
            return new BelCard(1237, "1234567", 506, 1250,100,"BYN");
        } else if (someCard == 2) {
            {return new BelCard(1245, "7891011", 809, 1500,200,"BYN");
            }
        } else if (someCard == 3) {
            return new MasterCard(1789, "9493939", 604, 1900,250,"USD");
        } else if (someCard == 4) {
            return new VisaCard(1256, "5233255", 900, 2000,300,"USD");
        } else {
            System.out.println("There isn't card");
        }
        return null;
    }
}
