import java.util.Random;
import java.util.Scanner;

public class shipBattle {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '-';
            }
        }

        Random rand = new Random();
        int targetRow = rand.nextInt(5);
        int targetCol = rand.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        boolean targetDefeated = false;
        Scanner scanner = new Scanner(System.in);

        while (!targetDefeated) {
            displayBoard(board);

            int row = -1;
            while (row < 1 || row > 5) {
                System.out.print("Enter the row (1-5): ");
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (row < 1 || row > 5) {
                        System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }

            int col = -1;
            while (col < 1 || col > 5) {
                System.out.print("Enter the column (1-5): ");
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                    if (col < 1 || col > 5) {
                        System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }

            row--;
            col--;

            if (board[row][col] != '-') {
                System.out.println("You've already shot here! Try again.");
            } else {
                board[row][col] = '*';
                if (row == targetRow && col == targetCol) {
                    targetDefeated = true;
                }
            }
        }

        board[targetRow][targetCol] = 'x';
        displayBoard(board);

        System.out.println("You have won!");
    }

    public static void displayBoard(char[][] board) {
        System.out.println("  1 | 2 | 3 | 4 | 5 ");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
