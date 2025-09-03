class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is NOT a Palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("Madam");
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker("Hello");
        p2.displayResult();
    }
}
