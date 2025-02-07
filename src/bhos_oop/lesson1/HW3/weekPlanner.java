import java.util.Locale;
import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] args) {
        String [][] schedule = new String [7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "watch a film";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Sleep";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "play video games";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go to work";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "use social media all day";
        while(true) {
            System.out.print("Please, input the day of the week: ");
            Scanner in = new Scanner(System.in);
            String normalday = in.nextLine();
            String day = normalday.toLowerCase().strip();
            if (day.equals("exit")) {
                break;
            }
            switch (day) {
                case "sunday":
                    System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;








            }


        }
    }
}
