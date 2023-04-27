package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class chocoletDistribution {
	static int minimumDiff(int[] a,int n) {
		ArrayList<Integer> al=new ArrayList<>();
		Arrays.sort(a);
		int min=0;
		for(int i=0;i<a.length-n;i++) {
			min=a[(i+n)-1]-a[i];
			al.add(min);
		}
		Collections.sort(al);
		int result=al.get(0);
		return result;
	}
	public static void main(String[] args) {
		int[] a= {7,3,2,4,9,12,56};
		int student=3;
		System.out.println(minimumDiff(a, student));
	}

}
