package dsa;

public class MinMax {
	static int sum(int[] a,int n) {
		int min=a[0],max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i])max=a[i];
			if(min>a[i])min=a[i];
		}
		int sum=max+min;
		return sum;
	}
	public static void main(String[] args) {
		int[] a= {-2,1,-1,5,3};
		int N=a.length;
		System.out.println(sum(a,N));
	}

}
