class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int[] resultArr = new int[2]; 
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(values.containsKey(diff)) {
                resultArr[0] = values.get(diff);
                resultArr[1] = i;
            }
            values.put(nums[i], i);
        }
        return resultArr;
    }
}
