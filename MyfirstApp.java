import java.util.Locale;

public class MyfirstApp{
    public static void main (String [] args) {
        int y = 5;
        double x = 1.23456;
        System.out.println(y);
        //Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.print("And so?!");
    }    
}