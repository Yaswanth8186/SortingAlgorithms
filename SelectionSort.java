public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {10, 4, 7, 12, 8};
		int k, n = a.length, j, smallest;
		for(int i = 0;i < n - 1;i++) {
			for( j = i, smallest = a[i], k = i; j < n;j++)
				if(a[j] < smallest) {
					k = j;
					smallest = a[j];
				}
			if(i != k) {
			a[i] = a[i] + a[k];
			a[k] = a[i] - a[k];
			a[i] = a[i] - a[k];
			}
		}
		for(int i = 0; i < n;i++) 
			System.out.print(a[i] + " ");
	}
}
