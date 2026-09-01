class State{
    int startRow;
    int startCol;
    int energy;
    int mask;
    State(int startRow,int startCol,int energy,int mask){
        this.startRow=startRow;
        this.startCol=startCol;
        this.energy=energy;
        this.mask=mask;
    }
}
    class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m=classroom.length;
        int n=classroom[0].length();
        int startRow=0,startCol=0,totalLitter=0,mask=0;
        int[][] litterPos=new int[m][n]; //For mask to get the litter position
        //Find S and number of L's
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char c=classroom[i].charAt(j);
                if(c=='S'){
                    startRow=i;
                    startCol=j;
                }
                if(c=='L'){
                    litterPos[i][j]=totalLitter; //positions are 0-indexed
                    totalLitter++; // count is not 0-indexed (if 2 L's then totalLitter is 2)
                }
            }
        }
        int fullMask=(1<<totalLitter)-1; // totalLitter=2 then 100-1=11
        int[][] directions={
            {-1,0},{1,0},{0,-1},{0,1}
        };
        Queue<State> q=new LinkedList<>();
        q.offer(new State(startRow,startCol,energy,mask));
        boolean[][][][] vis=new boolean[m][n][energy+1][1<<totalLitter];
        vis[startRow][startCol][energy][0]=true;
        int moves=0;
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                State cur=q.poll();
                if(cur.mask==fullMask) return moves;
                if(cur.energy==0) continue;
                for(int[] d:directions){
                    int newRow=cur.startRow+d[0];
                    int newCol=cur.startCol+d[1];
                    if(newRow<0 || newRow>=m || newCol<0 || newCol>=n) continue;
                    char cell=classroom[newRow].charAt(newCol);
                    if(cell=='X') continue;
                    int newEnergy=cur.energy-1;
                    int newMask=cur.mask;
                    if(cell=='R') newEnergy=energy;
                    if(cell=='L'){
                        int litterPosAtCell=litterPos[newRow][newCol];
                        newMask|=(1<<litterPosAtCell);
                    }
                    if(vis[newRow][newCol][newEnergy][newMask]==true) continue;
                    vis[newRow][newCol][newEnergy][newMask]=true;
                    q.offer(new State(newRow,newCol,newEnergy,newMask));
                }
            }
            moves++;
        }
        return -1;
    }
}