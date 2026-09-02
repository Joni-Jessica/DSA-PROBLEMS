class Solution {
    public int solve(int n, String s) {
        // code here
        int cnt=0;
        HashSet<Character> hs=new HashSet<>();
        HashSet<Character> list=new HashSet<>();
        for(char c:s.toCharArray()){
            if(hs.contains(c)) hs.remove(c);
            else{
                if(!list.contains(c) && hs.size()<n) hs.add(c);
                else{
                    if(!list.contains(c)) cnt++;
                    list.add(c);
                }
            }
            //System.out.println(hs.size());
        }
        return cnt;
    }
}
