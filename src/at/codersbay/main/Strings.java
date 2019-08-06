package at.codersbay.main;

public class Strings {

    private static String String1 = "Hello World";
    private static String String2 = "Good Night";

    public static void DisplayStringTask()
    {
        System.out.println("String1: " + String1);
        System.out.println("String2: " + String2);
        System.out.println("Merged Strings: " + String1 + " " + String2);
        String1 = String2;
        System.out.println("String1: " + String1);
        System.out.println("String2: " + String2);
    }
}
