public class ForLoops {
    static void main() {
        //Loop through a list and look for a certain value.
        int[] arr = {1,5,2,3,4,5};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 5){
                System.out.println("Found a 5 at Index " + i);
                //NB: arr.toString(); arr.deepToString()
            }
        }
    }
}
