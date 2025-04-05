package error_handling2;


class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (UnderageException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This block always runs.");
        }
    }

    static void checkAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You must be at least 18 years old.");
        }
        System.out.println("Welcome! You are allowed.");
    }
}
