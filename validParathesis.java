class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            if(c1 == '[' || c1 == '{' || c1 == '(') {
                st.push(c1);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                char c2 = st.pop();
                if(c1 == ']' && c2 != '[') {
                    return false;
                }
                if(c1 == ')' && c2 != '(') {
                    return false;
                }
                if(c1 == '}' && c2 != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
