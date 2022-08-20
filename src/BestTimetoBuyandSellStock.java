public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }


    // Alternative
    /*
    public static int maxProfit(int[] prices)
    {

        int left = 0;
        int right = left + 1;
        int profit = 0;

        while (right < prices.length)
        {
            if (prices[left] <= prices[right])
            {
                if (prices[right] - prices[left] > profit)
                    profit = prices[right] - prices[left];
            }
            else{
                left = right;
            }
            right++;
        }

        return profit;
    }
    */
}
