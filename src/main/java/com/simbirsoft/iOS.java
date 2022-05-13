package com.simbirsoft;

public class iOS extends Phones {

    public void rangeiOS() {
        models[0] = "iPhone 10";
        models[1] = "iPhone 11";
        models[2] = "iPhone 12";

        prices[0] = 35500;
        prices[1] = 47000;
        prices[2] = 59900;

        System.out.println("Доступный ассортимент телефонов на базе iOS:");

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Модель: " + models[i] + ". Цена: " + prices[i]);
        }
    }

    void setOnCredit(boolean onCredit) {
        this.onCredit = onCredit;
        if (onCredit) {
            System.out.println("Телефоны на iOS доступны в кредит");
        } else {
            System.out.println("Возможность кредита для телефонов на iOS отсутсвует");
        }
    }
}
