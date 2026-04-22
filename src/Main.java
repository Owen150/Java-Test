import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Primitive Types - 8
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';

        //Variables are stored in different memory locations, Independent of each other.
        //Primitive Types Store Actual Values.
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);  //Remains Unchanged

        //Reference Types do not store actual values, but a reference to an object somewhere in the memory.
        Date now = new Date();
        System.out.println(now);

        String message = "Hello World" + "!!";
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        //byte ages = scanner.nextByte(System.out.println("Enter Your Age: "));
    }
}