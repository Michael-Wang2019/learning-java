package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain2 {
    public static void main(String[] args) {

        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "No.1 Rd";
        littleSuperMarket.superMarketName = "tesco";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandises[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "id" + i;
            m.name = "goods" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;

        }
        System.out.println("wellcome to purchase");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);
        while (open) {
            System.out.println("supermarket name " + littleSuperMarket.superMarketName);
            System.out.println("supermarket address " + littleSuperMarket.address);
            System.out.println("supermarket parkingcount " + littleSuperMarket.parkingCount);
            System.out.println(" sild goods " + littleSuperMarket.incomingSum);
            System.out.println(" total goods " + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "custmer ID" + ((int) (Math.random() * 10000));
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    littleSuperMarket.parkingCount--;

                }
            }


        }


    }
}
