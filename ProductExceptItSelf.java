package dsa;

import java.util.Arrays;

public class ProductExceptItSelf {
	static int[] value(int[] a) {
		int[] b=new int[a.length];
		int j=0;
		while(j<a.length) {
			int resu=1;
			for(int i=0;i<a.length;i++) {
				if(a[j]!=a[i]) {
					resu*=a[i];
				}
			}
			b[j]=resu;
			j++;
		}
		return b;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b=value(a);
		System.out.println(Arrays.toString(b));
//		
	}

}
