import java.util.Scanner;

public class DoWhileLoops {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int counter = 0;

        do {
            System.out.print("Type a number: ");
            n = sc.nextInt();
            counter++;
        } while (n != 10);

        System.out.print("You tried " + counter + " times.");
        sc.close();
    }
}
