package dsa;

public class StockBuySell {
	static int profit(int[] a) {
		int buy=a[0],maxpro=0;
		int pro=0;
		for(int i=0;i<a.length;i++) {
			buy=Math.min(a[i], buy);
			pro=a[i]-buy;
			maxpro=Math.max(maxpro, pro);
		}
		return maxpro;
	}
	public static void main(String[] args) {
		int[] a= {7,6,4,3,1};
		System.out.println("Max profit is :"+profit(a));
		
	}

}
