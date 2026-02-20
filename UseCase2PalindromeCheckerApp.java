public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String str = "madam";
        
        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        
        // Check if it's a palindrome using conditional statement
        if (str.equals(reversed)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
