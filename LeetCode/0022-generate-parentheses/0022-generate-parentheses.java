class Solution {
    public void solve(int n,int op,int cl,String res,List<String> list){
        if(res.length()==n){
            list.add(res);
            return;
        }
        if(op<n/2) solve(n,op+1,cl,res+'(',list);
        if(cl<op) solve(n,op,cl+1,res+')',list);
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve(2*n,0,0,"",list);
        return list;
    }
}