class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        int cnt=0;
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,true);
        vis[0]=false;vis[1]=false;
        for(int i=2;i*i<n;i++){
            if(vis[i]){
                for(int j=i*i;j<n;j+=i){
                    if(j%i==0) vis[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(vis[i]) cnt++;
        }
        return cnt;
    }
}