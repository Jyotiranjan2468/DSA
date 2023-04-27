package dsa;

public class SearchInRotatedArray {
	static int index(int[] a,int n) {
		int start=0,end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==n)return mid;
			if(a[start]<a[mid]) {
				if(n>=a[start]&&n<a[mid]){
					end=mid-1;
				}else {
					start=mid+1;
				}
			}else {
				if(n>a[mid]&&n<=a[end]) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a= {4,5,6,7,0,1,2};
		int search=0;
		System.out.println(index(a, search));
	}

}
