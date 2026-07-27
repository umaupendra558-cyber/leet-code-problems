class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] count = new int[101];
        
       
        for (int num : nums) {
            count[num]++;
        }
        
        
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            int currentFreq = count[i];
            count[i] = sum; 
            sum += currentFreq;
        }
        
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}
