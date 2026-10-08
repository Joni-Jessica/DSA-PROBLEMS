class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(idx>0) sb.append(c);
                idx++;
            }else{
                idx--;
                if(idx>0)  sb.append(c); 
            }
        }
        return sb.toString();
    }
}