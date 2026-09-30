class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Stack<Character> st=new Stack<>();
        int n=seq.length();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            char c=seq.charAt(i);
            if(c=='('){
                st.push(c);
                if(st.size()%2==0) res[i]=1;
                else res[i]=0;
            }else{
                if(st.size()%2==0) res[i]=1;
                else res[i]=0;
                st.pop();
            }
        }
        return res;
    }
}