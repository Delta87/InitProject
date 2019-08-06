package at.codersbay.main;

/**
 *  Eine Klasse für die Berechnung verschiedener Aufgaben.
 */
public class Rechnen {


    /**
     * Berechnet das Ergebnis einer Addition.
     *
     * @param pZahl1 Die erste Zahl die verwendet wird
     * @param pZahl2 Die zweite Zahl die verwendet wird.
     */
    public static void addition(int pZahl1, int pZahl2)
    {
        System.out.println(pZahl1 + " + " + pZahl2 + " = " + (pZahl1 + pZahl2));
    }

    /**
     * Berechnet das Ergebnis der Subtraktion.
     *
     * @param pZahl1 Die erste Zahl die verwendet wird
     * @param pZahl2 Die zweite Zahl die verwendet wird.
     */
    public static void substraction(int pZahl1, int pZahl2)
    {
        System.out.println(pZahl1 + " - " + pZahl2 + " = " + (pZahl1 - pZahl2));
    }


    /**
     * Berechnet das Ergebnis der Multiplikation.
     *
     * @param pZahl1 Die erste Zahl die verwendet wird
     * @param pZahl2 Die zweite Zahl die verwendet wird.
     */
    public static void multiplication(int pZahl1, int pZahl2)
    {
        System.out.println(pZahl1 + " * " + pZahl2 + " = " + (pZahl1 * pZahl2));
    }


    /**
     * Berechnet das Ergebnis der Division.
     *
     * @param pZahl1 Die erste Zahl die verwendet wird
     * @param pZahl2 Die zweite Zahl die verwendet wird.
     */
    public static void divisision(int pZahl1, int pZahl2)
    {
        System.out.println(pZahl1 + " / " + pZahl2 + " = " + (pZahl1 / pZahl2));
    }

}
