package dsa;

import java.util.ArrayList;

public class contensDuplicate {
	static boolean presentDuplicate(int[] a) {
		ArrayList al=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(al.contains(a[i])) {
				return true;
			}else {
				al.add(a[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(presentDuplicate(a));
	}

}
