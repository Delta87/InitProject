package at.codersbay.main;

import java.text.DecimalFormat;

public class CashTask {

    public static void printCash()
    {



        double Cash = 50.00d;
        double AllItems = 0.0d;
        double backvalue = 0.0d;


        String Items[][] = new String[4][];
        Items[0] = new String[3];
        Items[1] = new String[3];
        Items[2] = new String[3];
        Items[3] = new String[3];

        Items[0][0] = "Wurst";
        Items[0][1] = "1";
        Items[0][2] = "4.20";

        Items[1][0] = "Käse";
        Items[1][1] = "1";
        Items[1][2] = "2.30";

        Items[2][0] = "Brot";
        Items[2][1] = "1";
        Items[2][2] = "2.10";

        Items[3][0] = "DVD";
        Items[3][1] = "2";
        Items[3][2] = "12.00";

        for (int i = 0; i < 4; i++)
        {
            AllItems = AllItems + (Double.parseDouble(Items[i][1]) * Double.parseDouble(Items[i][2]));
        }
        backvalue = Cash - AllItems;

        if(backvalue >= 0.0d)
        {
            System.out.println("-------------------------");
            for (int i = 0; i < 4; i++)
            {
                System.out.println(Items[i][0] + " | " + Items[i][1] + " x " + Items[i][2] + " EUR |  " + Double.parseDouble(Items[i][1]) * Double.parseDouble(Items[i][2]) + " EUR" );
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
