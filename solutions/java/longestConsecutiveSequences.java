class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int maxCount = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        System.out.println(set);

        for(int num: set) {
            while(set.contains(num)) {
                count++;
                num++;
            }
            maxCount = Math.max(count, maxCount);
            count = 0;
        }
        return maxCount;
    }
}
