package at.codersbay.main;

public class SimpleMath {

    private static int number1 = 0;
    private static int number2 = 0;
    private static int result = 0;

    public static void showSimpleMath()
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int k = 1; k <= 10; k++)
            {
                number1 = k;
                number2 = i;
                result = (k*i);
                System.out.println( number1 + " * " + number2 + " = " + result);
            }
            System.out.println(" ");
        }
    }
}
