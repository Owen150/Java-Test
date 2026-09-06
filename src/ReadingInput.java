import java.util.Scanner;

public class ReadingInput {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        //println Skips a line when taking input, print keeps input on the same line
        System.out.print("Name: ");
        //byte age = scanner.nextByte(); .nextInt(); .nextBoolean(); .nextDouble(); etc
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
        //String scanned = scanner.next();
        //int x = Integer.parseInt(scanned); //Convert a String to an Integer
        //System.out.println(x);
    }
}
