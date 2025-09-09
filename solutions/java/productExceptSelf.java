class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] output = new int[len];

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                prefix[0] = 1;
            }  else {
                prefix[i] = prefix[i-1] * nums[i-1];
            }
        }
        for(int i=len-1; i>=0; i--) {
            if(i == len-1) {
                suffix[len-1] = 1;
            } else {
                suffix[i] = suffix[i+1] * nums[i+1]; 
            }
        }

        for(int i=0; i<output.length; i++) {
            output[i] = prefix[i] * suffix[i];
        }
        return output;
    }
}  
