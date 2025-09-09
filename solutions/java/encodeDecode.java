class Solution {

    public String encode(List<String> strs) {
        Iterator iter = strs.iterator();
        String str = "";
        while(iter.hasNext()) {
            str = str + iter.next() + "|";
        }
        return str;
    }

    public List<String> decode(String str) {
        System.out.println(str);
        ArrayList<String> list = new ArrayList<>();
        String newStr = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != '|') {
                newStr+= str.charAt(i);
            } else {
                list.add(newStr);
                newStr = "";
            }
        }
        return list;
    }
}
