
public class MaximumElement {
	public static int min(int[] a,int n) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static int max(int[] a,int n) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		return max;
	}
	public static void main(String []args) {
		int[] arry = {10,5,36,89,75,6,98};
		int n = arry.length;
		System.out.println("Given Array Elements are:");
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
		System.out.println("Minimum Element "+min(arry,n));
		System.out.println("Maximum Element "+max(arry,n));
	}

}
