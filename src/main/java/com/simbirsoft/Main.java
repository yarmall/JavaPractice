package com.simbirsoft;

public class Main {

    public static void main(String[] args) {

        Android android = new Android();
        iOS iOS = new iOS();

        android.rangeAndroid();
        android.setOnCredit(true);

        System.out.println();

        iOS.rangeiOS();
        iOS.setOnCredit(false);
        }
    }

