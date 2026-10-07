public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Found a cheaper day to buy
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Found a higher profit
            }
        }

        return maxProfit;
    }
}

    
