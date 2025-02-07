import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class guesser {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        String name = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        int[] guesses = new int[100];
        name = sc.nextLine();
        boolean flag = true;
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        int count = 0;
        while (flag) {
            int[] userGuesses = Arrays.copyOf(guesses, count);
            Arrays.sort(userGuesses);
            reverseArray(userGuesses);
            System.out.println("Your guesses: " + Arrays.toString(userGuesses));
            System.out.print("Please enter your number: ");
            Scanner sc2 = new Scanner(System.in);
            int input1;
            if (sc2.hasNextInt()) {
                input1 = sc2.nextInt();
                guesses[count] = input1;
                count++;
            } else {
                System.out.println("Please enter an integer! ");
                continue;
            }
            if (input1 > randomNum) {
                System.out.println("You entered a number greater than random number");
            } else if (input1 < randomNum) {
                System.out.println("You entered a number less than random number ");
            } else {
                System.out.println("You entered a number equals to random number and is " + randomNum);
                System.out.println("Congratulations, " + name + "!");
                flag = false;
            }
        }
    }
    // Method to reverse an int array
    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

