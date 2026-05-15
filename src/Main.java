import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Variables
        //A. Using a Coma, we can declare multiple variables on the same line.
        //int age = 12, temperature = 20;

        //B. We can copy the value of one variable into another.
        //int myAge = 27;
        //int herAge = myAge;

        //1. Primitive Types - 8 in Total:
        byte age = 30; //Size: 1 Byte. Range: -127 to 127.
        short deposit = 27000; //Size: 2 Bytes. Range: -32k to 32k.
        int numberOfYears = 149; //Size: 4 Bytes. Range: -2B to 2B.
        long viewsCount = 3_123_456_789L; //Size: 8 Bytes. Underscore similar to ",".
        float price = 10.99F; //Size: 4 Bytes.
        char letter = 'A';

        //Primitive Types Store Actual Values. Variables are stored in different memory locations, Independent of each other.
        byte x = 1;
        byte y = x;
        x = 2;
        //System.out.println(y);  //Value Remains Unchanged.

        //2. Reference Types - Do not store actual values but a Reference to an object somewhere in the memory i.e. Stores the Memory Address Location.
        Date now = new Date();
        //System.out.println(now);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        //System.out.println(point2); //Value is Updated.

        //String Objects are Immutable - Creates a New Instance of the String Object.
        String message = "Hello World" + "!!";
        //System.out.println(message.indexOf("e"));
        //message.length, .startsWith(), .endsWith(), .replace(target, replacement), .trim() - removes whitespaces, .toUpperCase(), .toLowerCase() etc.

        //Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] points = {2, 3, 6, 1, 2};
        Arrays.sort(points);
        System.out.println(Arrays.toString(points));

        //Multi-Dimensional Arrays
        //Two Rows and Three Columns.
        int[][] multi = new int[2][3]; //also, int[][] multi = {{2,3,6},{1,2,3}};
        multi[0][0] = 1; //First Row, First Column
        System.out.println(Arrays.deepToString(multi)); //deepToString() for printing Multi-dimensional arrays.
        //Output - Rows printed in Horizontal Order, Columns printed Vertically, both separated by a coma/s .i.e. [[1, 0, 0], [0, 0, 0]].

    }
}