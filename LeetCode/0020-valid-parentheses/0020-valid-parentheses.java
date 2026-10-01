class Solution {
    public boolean isValid(String s) {
        char a = s.charAt(0), b = s.charAt(s.length() - 1);
        if (a == ']' || a == ')' || a == '}' || b == '(' || b == '[' || b == '{')
            return false;
        Stack<Character> st = new Stack<>();
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
                top++;
            } else if (c == ')') {
                if(top==-1) return false;
                if (st.get(top) != '(')
                    return false;
                else {
                    st.pop();
                    top--;
                }
            } else if (c == ']') {
                if(top==-1) return false;
                if (st.get(top) != '[')
                    return false;
                else {
                    st.pop();
                    top--;
                }
            } else if (c == '}') {
                if(top==-1) return false;
                if (st.get(top) != '{')
                    return false;
                else {
                    st.pop();
                    top--;
                }
            }
        }
        return st.size() == 0;
    }
}