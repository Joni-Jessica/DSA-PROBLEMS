class Solution {
    public int countCommas(int n) {
        int digits=(int)Math.log10(n)+1;
        if(digits<4) return 0;
        return Math.abs(n-999);
    }
}