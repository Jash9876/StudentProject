public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String str = "madam";
        
        // Reverse the string using a for loop and string concatenation
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        
        // Compare original and reversed using equals() method
        if (str.equals(reversed)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
