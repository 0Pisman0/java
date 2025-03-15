import java.util.Scanner;

interface PerformOperation {
    String check(int num);
}

public class Main {
    static PerformOperation isOdd() {
        return (num) -> num % 2 == 0 ? "EVEN" : "ODD";
    }


    static PerformOperation isPrime() {
        return (num) -> {
            if (num <= 1) return "COMPOSITE";
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return "COMPOSITE";
            }
            return "PRIME";
        };
    }


    static PerformOperation isPalindrome() {
        return (num) -> {
            String str = String.valueOf(num);
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equals(reverse) ? "PALINDROME" : "NOT PALINDROME";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number for how much times check:");
        int t = scanner.nextInt();


        while (t-- > 0) {
            System.out.println("Which Operation(1,2,3):");
            int op = scanner.nextInt();
            System.out.println("Input your number:");
            int num = scanner.nextInt();

            PerformOperation operation = null;


            if (op == 1) {
                operation = isOdd();
            } else if (op == 2) {
                operation = isPrime();
            } else if (op == 3) {
                operation = isPalindrome();
            }


            System.out.println(operation.check(num));
        }
    }
}
