class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        Stack<Integer> s = new Stack<>();
        for(String token: tokens) {
            if(!set.contains(token)) {
                s.push(Integer.parseInt(token));
            } else {
                int value1 = s.pop();
                int value2 = s.pop();
                if(token.equals("+")) {
                    s.push(value1+value2);
                } else if(token.equals("-")) {
                    s.push(value2 - value1);
                } else if(token.equals("*")) {
                    s.push(value2 * value1);
                } else if(token.equals("/")) {
                    s.push(value2 / value1);
                }
            }
        }
        return s.pop();
    }
}
