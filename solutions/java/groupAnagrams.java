class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagramStr = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String newStr = new String(charArr);
            if(!anagramStr.containsKey(newStr)) {
                anagramStr.put(newStr, new ArrayList<>());
            }
            anagramStr.get(newStr).add(strs[i]);
        }
        return new ArrayList<>(anagramStr.values());
    }
}
