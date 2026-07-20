class Solution {
    public int maximum69Number (int num) {
        // Convert the integer to a string to easily manipulate individual digits
        String numStr = Integer.toString(num);
        
        // Find the index of the first '6' from the left
        int firstSixIndex = numStr.indexOf('6');
        
        // If a '6' is found, replace it with '9'
        if (firstSixIndex != -1) {
            numStr = numStr.substring(0, firstSixIndex) + '9' + numStr.substring(firstSixIndex + 1);
        }
        
        // Convert the modified string back to an integer and return it
        return Integer.parseInt(numStr);
    }
}
