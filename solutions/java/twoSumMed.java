class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] output = new int[2];

        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum > target) {
                right--;
            } else if(sum < target) {
                left++;
            } else {
                output[0] = left+1;
                output[1] = right+1;
                break;
            }
        } 
        return output;
    }
}
