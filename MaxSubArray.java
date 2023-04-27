package dsa;

public class MaxSubArray {
	static int isMaximum(int[] a) {
		int max=a[0];
		int sum=0,s=0,start=0,end=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(max<sum) {
				max=sum;
				start=s;
				end=i;
			}
			if(sum<0) {
				sum=0;
				s=i+1;
			}
		}
		System.out.println("index is "+start+" to "+end);
		return max;
	}
	public static void main(String[] args) {
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(isMaximum(a));
	}

}
