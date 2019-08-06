package at.codersbay.main;

import java.util.HashMap;
import java.util.Map;

public class CashTask {

    public static void printCash()
    {
        double Cash = 50.00d;
        double AllItems = 0.0d;
        double backvalue = 0.0d;

        Map<String, ShopItem> ShopItems = new HashMap<>();
        ShopItems.put("Wurst", new ShopItem("Wurst", 1, 4.20d));
        ShopItems.put("Käse", new ShopItem("Käse", 1, 2.30d));
        ShopItems.put("Brot", new ShopItem("Brot", 1, 2.10d));
        ShopItems.put("DVD", new ShopItem("DVD", 2, 12.00d));


        for(String Key : ShopItems.keySet())
        {
            AllItems = AllItems + (Double.parseDouble(String.format("%s.00", ShopItems.get(Key).getCount())) * ShopItems.get(Key).getPrice());
        }

        backvalue = Cash - AllItems;

        if(backvalue >= 0.0d)
        {
            System.out.println("-------------------------");

            for(String Key : ShopItems.keySet())
            {
                System.out.println(ShopItems.get(Key).getItemName() + " | " + ShopItems.get(Key).getCount() + " * " + ShopItems.get(Key).getPrice() + " EUR | " + (Double.parseDouble(String.format("%s.00", ShopItems.get(Key).getCount())) * ShopItems.get(Key).getPrice()));
            }

            System.out.println("-------------------------");
            System.out.println("Gesammt: " + AllItems + " EUR");
            System.out.println("Gegeben: " + Cash + " EUR");
            System.out.println("-------------------------");
            System.out.println("Retour: " + (Cash - AllItems)  + " EUR");
        }
        else
        {
            System.out.println("Der Gesammtbetrag von " + AllItems + " übersteigt das Budget von "+ Cash +" EUR");
        }
    }
}
