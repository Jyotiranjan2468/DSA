package dsa;

public class RainWaterTrapping {
	static int storeWater(int[] a) {
		int[] left=new int[a.length];
		int[] right=new int[a.length];
		int lef=0,rig=0,trap=0;
		for(int i=0;i<a.length;i++) {
			lef=Math.max(lef, a[i]);
			left[i]=lef;
		}
		for(int j=a.length-1;j>=0;j--) {
			rig=Math.max(rig, a[j]);
			right[j]=rig;
		}
		for(int k=0;k<a.length;k++) {
			trap+=(Math.min(left[k], right[k]))-a[k];
		}
		return trap;
	}
	public static void main(String[] args) {
		int[] a= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Total unit of water is :"+storeWater(a));
	}

}
