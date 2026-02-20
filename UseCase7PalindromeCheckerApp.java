import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "refer";

        // Create a Deque and add characters
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear until deque is empty or mismatch found
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println('"' + input + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + input + '"' + " is not a palindrome.");
        }
    }
}
