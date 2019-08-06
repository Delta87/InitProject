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
        double gleitKommazahl = 123.123d;

        System.out.println("Aufgabe 1: ");
        System.out.println("Bool: " + status);
        System.out.println("Int: " + ganzZahl);
        System.out.println("String: " + ZeichenKette);
        System.out.println("Double: " + gleitKommazahl);


        // Aufgabe 2
        int Wert1 = 20;
        int Wert2 = 2;

        System.out.println(" ");
        System.out.println("Aufgabe 2:");
        Rechnen.addition(Wert1, Wert2);
        Rechnen.substraction(Wert1, Wert2);
        Rechnen.multiplication(Wert1, Wert2);
        Rechnen.divisision(Wert1, Wert2);


        //Aufgabe 3
        System.out.println(" ");
        System.out.println("Aufgabe 3: ");
        Strings.DisplayStringTask();

        //Aufgabe 4
        System.out.println(" ");
        System.out.println("Aufgabe 4: ");
        SimpleMath.showSimpleMath();




    }
}
