public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String str = "madam";
        
        // Convert string to character array
        char[] chars = str.toCharArray();
        
        // Use two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;
        
        // Compare characters from start and end
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        // Display result
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
