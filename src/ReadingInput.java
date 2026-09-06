import java.util.Scanner;

public class ReadingInput {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        //println Skips a line when taking input, print keeps input on the same line
        System.out.print("Name: ");
        //byte age = scanner.nextByte(); .nextInt(); .nextBoolean(); .nextDouble(); etc
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
