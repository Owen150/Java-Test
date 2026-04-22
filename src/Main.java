import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Variables
        //1. Primitive Types - 8 in Total
        byte age = 30; //Size: 1 Byte. Range: -127 to 127.
        int numberOfYears = 149; //Size: 4 Bytes. Range: -2B to 2B.
        long viewsCount = 3_123_456_789L; //Size: 8 Bytes. Underscore similar to ",".
        float price = 10.99F;
        char letter = 'A';

        //Primitive Types Store Actual Values. Variables are stored in different memory locations, Independent of each other.
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);  //Value Remains Unchanged.

        //2. Reference Types - Do not store actual values but a Reference to an object somewhere in the memory i.e. Stores the Memory Address Location.
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2); //Value is Updated.

        //String Objects are Immutable - Creates a New Instance of the String Object.
        String message = "Hello World" + "!!";
        System.out.println(message.indexOf("e"));

        Scanner scanner = new Scanner(System.in);
        //byte ages = scanner.nextByte(System.out.println("Enter Your Age: "));
    }
}