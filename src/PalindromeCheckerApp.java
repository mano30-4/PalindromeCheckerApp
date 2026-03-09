import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if(choice == 1){
            strategy = new StackStrategy();
        }
        else{
            strategy = new DequeStrategy();
        }

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.execute(input);

        if(result){
            System.out.println("The string is a Palindrome.");
        }
        else{
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}