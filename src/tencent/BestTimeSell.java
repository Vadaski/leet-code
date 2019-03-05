package tencent;

public class BestTimeSell {
	
	public static int maxProfit(int[] prices) {
        int firstLargest = 0;
        int secondLargest = 0;
        int accumulation = 0;
        boolean isBuying = false;
        for(int i = 0; i < prices.length-1 ;i++){
            int gap = prices[i+1]-prices[i];
            if(gap>0){
                accumulation += gap;
                isBuying = true;
            }else{
                if(isBuying){
                	if(accumulation > firstLargest) {
                		secondLargest = firstLargest;
                		firstLargest = accumulation;
                	}else if(accumulation > secondLargest){
						secondLargest = accumulation;
					}	
                	accumulation = 0;
                    isBuying = false;
                }
            }
        }
        return firstLargest+secondLargest;
    }

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {
				3,3,5,0,0,3,1,4
		}));

	}

}
