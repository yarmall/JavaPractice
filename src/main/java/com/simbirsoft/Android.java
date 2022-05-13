package com.simbirsoft;

public class Android extends Phones {

    void rangeAndroid() {
        models[0] = "Note 7";
        models[1] = "Note 8 pro";
        models[2] = "Note 10";

        prices[0] = 12000;
        prices[1] = 17000;
        prices[2] = 20000;

        System.out.println("Доступный ассортимент телефонов на базе Android:");

        for (int i = 0; i < prices.length; i++)
        {
            System.out.println("Модель: " + models[i] + ". Цена: " + prices[i]);
        }
    }

    void setOnCredit(boolean onCredit) {
        this.onCredit = onCredit;
        if (onCredit) {
            System.out.println("Телефоны на Android доступны в кредит");
        } else {
            System.out.println("Возможность кредита для телефонов на Android отсутсвует");
        }
    }
}
