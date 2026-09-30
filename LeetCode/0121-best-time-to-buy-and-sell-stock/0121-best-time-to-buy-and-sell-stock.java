class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0,maxProfit=0,minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice) minPrice=prices[i];
            profit=prices[i]-minPrice;
            if(profit>maxProfit) maxProfit=profit;
        }
        return maxProfit;
    }
}