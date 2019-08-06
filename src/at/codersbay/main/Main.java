package at.codersbay.main;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World");
        //System.out.println("Hello again");



        // Aufgabe 1
        boolean status = true;
        int ganzZahl = 10;
        String ZeichenKette = "Das ist eine Zeichenkette!";
        double gleitKommazahl = 123.123;

        System.out.printf("Aufgabe 1: \n");
        System.out.println("Bool: " + status);
        System.out.println("Int: " + ganzZahl);
        System.out.println("String: " + ZeichenKette);
        System.out.println("Double: " + gleitKommazahl);


        // Aufgabe 2
        int Wert1 = 20;
        int Wert2 = 2;

        System.out.printf("\n");
        System.out.printf("Aufgabe 2: \n");
        Rechnen.addition(Wert1, Wert2);
        Rechnen.substraction(Wert1, Wert2);
        Rechnen.multiplication(Wert1, Wert2);
        Rechnen.divisision(Wert1, Wert2);



    }
}
