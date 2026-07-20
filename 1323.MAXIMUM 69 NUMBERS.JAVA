class Solution {
    public int maximum69Number (int num) {
        // Convert the number to a string/char array to easily find and change digits
        char[] digits = Integer.toString(num).toCharArray();
        
        // Loop from left to right to find the first '6'
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9'; // Flip the first '6' to '9'
                break;           // We are only allowed to change at most one digit
            }
        }
        
        // Convert back to an integer and return
        return Integer.parseInt(new String(digits));
    }
}
