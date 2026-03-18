// ===== UC12 — Strategy Pattern =====

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Strategy 1 — Reverse String Method
static class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}

// Strategy 2 — Two Pointer Method
static class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String input) {

        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}