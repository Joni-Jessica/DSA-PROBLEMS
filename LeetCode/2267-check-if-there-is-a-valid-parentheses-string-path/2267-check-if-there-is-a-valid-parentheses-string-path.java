class Solution {
    public boolean hasValidPath(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        
        if(((n+m-1)%2)!=0) return false; //Length must be even
        if(grid[0][0]==')' || grid[n-1][m-1]=='(') return false;
        
        //dp[i][j]=set of possible balances at (i,j)
        //boolean array to represent balances
        boolean[][][] dp=new boolean[n][m][n+m+1];

        //grid[0][0]='('
        dp[0][0][1]=true;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int bal=0;bal<n+m+1;bal++){
                    if(!dp[i][j][bal]) continue;

                    //move right
                    if(j+1<m){
                        int nextBal= bal+((grid[i][j+1]=='(')?1:-1);
                        if(nextBal>=0) dp[i][j+1][nextBal]=true;
                    }

                    //Move down
                    if(i+1<n){
                        int nextBal= bal+((grid[i+1][j]=='(')?1:-1);
                        if(nextBal>=0) dp[i+1][j][nextBal]=true;
                    }
                }
            }
        }
        return dp[n-1][m-1][0];
    }
}