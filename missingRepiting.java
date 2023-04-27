package dsa;

import java.util.Arrays;

public class missingRepiting {
	static int[] element(int[] a,int n) {
		int[] b=new int[2];
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(i+1!=a[i]) {
				b[0]=a[i];
				b[1]=i+1;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		int[] a= {2,4,2,1,5};
		int n=5;
		int[] b=element(a,n);
		System.out.println(Arrays.toString(b));
	}

}
