public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("welcome to panlindrome checker management app");
        System.out.println("version 1.0");
        System.out.println("system initailised succesfully");
        String word = "madam";

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Word: " + word);
            System.out.println("Result: It IS a palindrome.");
        } else {
            System.out.println("Word: " + word);
            System.out.println("Result: It is NOT a palindrome.");

    }
}