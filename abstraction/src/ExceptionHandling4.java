import java.util.Scanner;

class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super("User Outside India cannot be registered");
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class ExceptionHandling4 {

    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException();
        } 
        else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionHandling4 registration = new ExceptionHandling4();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        try {
            registration.registerUser(username, country);
        } 
        
        catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException: " + e.getMessage());
        }

        scanner.close();
    }
}