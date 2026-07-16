class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // As discussed, negative numbers are not palindromes (e.g., -121 because of the '-')
        // Also, if the last digit of the number is 0, the first digit must also be 0 for it to be a palindrome.
        // Only 0 satisfies this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // Keep reversing the second half of the digits until it's greater than or equal to the first half
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example, for 12321, at the end of the loop we get x = 12, revertedNumber = 123,
        // so we can check x == revertedNumber/10 to ignore the middle digit '3'.
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
