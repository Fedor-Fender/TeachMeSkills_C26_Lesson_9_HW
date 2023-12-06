package com.techmeskills.homework_9.task_3.module.client;

import com.techmeskills.homework_9.task_3.module.address.Address;
import com.techmeskills.homework_9.task_3.module.card.BaseCard;

import java.util.Date;

public class Client {

    private String nameClient;
    private String passportNumber;
    private String bithDate;
    private Address address;
    private BaseCard[] cards;

    public Client(String nameClient, String passportNumber, String bithDate, Address address, BaseCard[] cards) {
        this.nameClient = nameClient;
        this.passportNumber = passportNumber;
        this.bithDate = bithDate;
        this.address = address;
        this.cards = cards;
    }

    public String getNameClient() {
        return nameClient;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getPasportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }
}
