//brute force approach

class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length;i++){
            int cost = prices[i]-mini;
            maxProfit = max(maxProfit,cost);
            mini = min(mini,prices[i]);
        }
        return maxProfit;
    }
    public int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public int min(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
}

time = 3ms


//optimal solution
//kadane's algorithm

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}

time = 1ms
