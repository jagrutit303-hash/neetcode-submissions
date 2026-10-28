class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minPrice = prices[0];
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            if((prices[i] - minPrice)>maxprofit){
                maxprofit = prices[i] - minPrice;
            }
        }
        return maxprofit;
    }
}
