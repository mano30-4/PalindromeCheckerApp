import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "level";

        char[] letters = word.toCharArray();

        int start = 0;
        int end = letters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (letters[start] != letters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Word: " + word);
            System.out.println("Result: It IS a palindrome.");
        } else {
            System.out.println("Word: " + word);
            System.out.println("Result: It is NOT a palindrome.");


            String input = "noon";
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            boolean isPalindrome = true;

            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);

        }
    }
}