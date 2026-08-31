class Solution {
    public String winningPlayer(int x, int y) {
        int c=0;
        while(x>=1 && y>=4){
            c++;
            x-=1;y-=4;
        }
        if(c%2==0) return "Bob";
        return "Alice";
    }
}