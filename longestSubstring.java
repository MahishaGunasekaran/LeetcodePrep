class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int index1 = 0;
        int index2 = 0;
        int maxLength = 0;

        while(index2 < s.length()) {
            if(!set.contains(s.charAt(index2))) {
                set.add(s.charAt(index2));
                int length = (index2 -index1) + 1;
                maxLength = Math.max(maxLength, length);
                index2++;
            } else {
                set.remove(s.charAt(index1));
                index1++;
            }
        }
        return maxLength;
    }
}
