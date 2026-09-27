class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int top=-1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c) || c=='('){
                st.push(c);
                top++;
            }else{
                while(top!=-1 && st.get(top)!='('){
                    sb.append(st.pop());
                    top--;
                }
                if(top!=-1 && st.get(top)=='('){
                    st.pop();
                    top--;
                }
                while(sb.length()!=0){
                    //if(st.get(top)=='(') st.pop();
                    st.push(sb.charAt(0));
                    top++;
                    sb.deleteCharAt(0);
                }
            }
        }
        if(top==-1) return sb.toString();
        StringBuilder res=new StringBuilder();
        while(st.size()!=0){
            char c=st.pop();
            if(Character.isLetter(c))
            res.append(c);
            top--;
        }
        //System.out.println(st);
        return res.reverse().toString();
    }
}