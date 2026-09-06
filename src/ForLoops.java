import java.util.Scanner;

public class ForLoops {
    static void main() {
        //Loop through a list and look for a certain value.
        //For Loop - When you know you're gonna do for a set amount of times.
        //Different to While loop - Could change based on the program/user input.
        int[] arr = {1,5,2,3,4,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 5){
                System.out.println("Found a 5 at Index " + i);
                //NB: arr.toString(); arr.deepToString()
            }
        }
        //To check elements and their indexes inside an array
        int count = 0;
        for(int element : arr){
            System.out.println("Found a " + element + " at Index " + count);
            count++; //Keeps track of the element's index inside the array.
        }

        //Adding Values to an Array.
        for(int i = 0; i < names.length; i++){
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for(String str : names){    //NB: Primitive variable types - Small letters i.e. byte, short, int; Reference Types - Capital Letters i.e. String, Date e.t.c
            if(str == "Red"){
                break;
            }
        }
    }
}
