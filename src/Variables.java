public class Variables
{
    public static void main ( String[] args )
    {
        //define 1 variable of each of the
        //following data types
        //byte	short		int 		long
        //float	double
        //char      boolean	String

        //integer variables
        byte bytee = 42;
        short shorrt = 32000;
        int intt = 2147482222;
        long loong = 83777777777L; // You need an 'L' at the end to let Java know it is a long number literal

        // reals (contains decimals)
        float floaat = 40.412F; // The 'F' is needed so Java does not view the float as a double
        double douuble = 123456.78910;

        // Booleans, Strings, Char)

        boolean booleann = false;
        String sttring = "Good morning all";
        char letter = 'A';

        // Printing

        System.out.println( bytee + 5);
        System.out.println(15 + shorrt);
        System.out.println(25 + intt);
        System.out.println(35 + loong);
        System.out.println(45 + floaat);
        System.out.println(55 + douuble);
        System.out.println("Boolean " + booleann + " Boolean"); // "booleann" can only be True or False
        System.out.println("This is a string: " + sttring);
        System.out.println(letter);
        System.out.println( bytee + shorrt + intt + " + randomNumbers");

        // etc.

        System.out.println("Testing");
        System.out.println("Predicted PSAT Score= " + bytee * 1010/35);






    }
}