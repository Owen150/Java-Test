import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        1. Variables
            A. Using a Coma, we can declare multiple variables on the same line.
            int age = 12, temperature = 20;

        B. We can copy the value of one variable into another.
            int myAge = 27;
            int herAge = myAge;

        i. Primitive Types
            Variables are stored in different memory locations, Independent of each other.
            Primitive variables store actual values.
            8 in Number: Byte, Short, Int, Long, Float, Double, Char, & Boolean.

            byte age = 30;
            //Size: 1 Byte. Range: -127 to 127.

            short deposit = 27000;
            //Size: 2 Bytes. Range: -32k to 32k.

            int numberOfYears = 149;
            //Size: 4 Bytes. Range: -2B to 2B.

            long viewsCount = 3_123_456_789L;
            //Size: 8 Bytes. "_" similar to "," .i.e. 3,123,456,789L

            float price = 10.99F;
            //Size: 4 Bytes.

            double
            //Size: 8 Bytes.

            char letter = 'A';
            //Size: 2 Bytes. Range: A,B,C,...

            boolean
            //Size: 1 Byte. Range: True or False.

            byte x = 1;
            byte y = x;
            x = 2;
            System.out.println(y);
            //Value of y remains unchanged .i.e y = 1.

        ii. Reference Types
        Reference variables store the memory address location of the actual object which is located somewhere in memory.
        Variables do not store actual values, but references to objects which are located/stored somewhere in the memory.

            A. Date Object
                Date now = new Date();
                System.out.println(now);
                //Displays the current date & time.

            B. Pointer Object
                Point point1 = new Point(1,2);
                Point point2 = point1;
                point1.x = 3;
                System.out.println(point2);
                //Pointer value is updated .i.e. {3,2}

        2. Strings
        String objects are Immutable/Unchangeable .i.e. One only creates a new instance of the original string object, but does not alter the value of the original string object.

        String message = "Hello World" + "!!";
        System.out.println(message.indexOf("e"));
        message.length, .startsWith(), .endsWith(), .replace(target, replacement), .trim() - removes whitespaces, .toUpperCase(), .toLowerCase() .e.t.c.

        3. Arrays
            i. Single Arrays
                int[] numbers = new int[5];
                numbers[0] = 1;
                numbers[1] = 2;
                System.out.println(Arrays.toString(numbers)); //{1,2,0,0,0}

                //numbers[10] = 4;
                //System.out.println(Arrays.toString(numbers));
                //Exception: ArrayIndexOutOfBounds.

                int[] points = {2, 3, 6, 1, 2};
                Arrays.sort(points); //Points arranged in Ascending Order.
                System.out.println(Arrays.toString(points));

            ii. Multi-Dimensional Arrays
                Two Rows and Three Columns.
                int[][] multi = new int[2][3]; //Also, int[][] multi = {{2,3,6},{1,2,3}};
                multi[0][0] = 1; //First Row, First Column
                System.out.println(Arrays.deepToString(multi));
                //deepToString() method: Used for printing Multi-dimensional arrays.
                //Output - Rows printed in Horizontal Order, Columns printed Vertically, both separated by a coma/s .i.e. [[1, 0, 0], [0, 0, 0]].

        6. Arithmetic Operations
        Operands: +, -, *, /, %
        int z = 1;
        z++;
        System.out.println(z); //2

        int b = 1;
        int q = b++;
        System.out.println(b); //2 .i.e. increment b by 1.
        System.out.println(q); //1 .i.e. q = b first.

        int r = 3;
        int f = ++r;
        System.out.println(r); //4 .i.e Value of r incremented by 1. Code processed line by line.
        System.out.println(f); //4 .i.e. First increment r by 1, assign it to f
        */
    }
}