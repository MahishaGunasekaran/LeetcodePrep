import java.util.Collection;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        boolean isOdd = false;
        int maxOdd = 0;
        if(s.length() == 1) {
            return 1;
        }

        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        Collection<Integer> values = map.values();
        for(int value: values) {
            if(value % 2 == 0) {
                count = count + value;
            }
            else {
                isOdd = true;
                count = count + value - 1;
            }
        }
        if(isOdd) count = count + 1;
        return count;
    }
}