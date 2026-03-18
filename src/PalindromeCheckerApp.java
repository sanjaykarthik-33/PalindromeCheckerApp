public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC6 — User Input Palindrome
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a word: ");
        String userWord = scanner.nextLine();

        String reversedUC6 = "";

// Reverse the input
        for (int i = userWord.length() - 1; i >= 0; i--) {
            reversedUC6 += userWord.charAt(i);
        }

// Check palindrome
        if (userWord.equalsIgnoreCase(reversedUC6)) {
            System.out.println(userWord + " is a Palindrome (User Input)");
        } else {
            System.out.println(userWord + " is NOT a Palindrome (User Input)");
        }
    }
}