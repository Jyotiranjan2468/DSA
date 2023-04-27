package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		List<int[]> arr=new ArrayList<>();
		int start=0,end=0;
		int len=4;
		int NoOfArray=a.length/len;
		int remender=a.length%len;
		for(int i=0;i<NoOfArray;i++) {
			end+=len;
			arr.add(Arrays.copyOfRange(a, start, end));
			start=end;
		}
		if(remender>0) {
			arr.add(Arrays.copyOfRange(a, start, start+remender));
		}
		for(int i=0;i<arr.size();i++) {
			System.out.println(Arrays.toString(arr.get(i)));
		}
	
	}

}
