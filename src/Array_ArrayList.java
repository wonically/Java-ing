import java.util.Arrays;

public class Array_ArrayList {

    public static void main(String[] args) {
        //Declaring an array
        //int[] myFavNumbers = new int[5]; or
        int[] myFavNumbers = {0, 2, 4, 6, 8};

        // Arrays don't support modifying a single element, so the following will yield an error:
        // myFavNumbers[0] = 1;
        // If changed, then change all.

        System.out.println("My favorite numbers are: " + Arrays.toString(myFavNumbers));
        System.out.println("My smallest favorite numbers are: " + myFavNumbers[0]);
    }
}
