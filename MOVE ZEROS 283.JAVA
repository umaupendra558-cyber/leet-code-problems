class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer to keep track of the position for the next non-zero element
        int insertPos = 0;
        
        // First pass: shift all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        
        // Second pass: fill the rest of the array with zeroes
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
