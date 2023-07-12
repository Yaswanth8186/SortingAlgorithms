public class BuubleSort {
	public static void main(String[] args) {
		int[] arr = {10,2,1,45,8,49};
		int temp, i,j;
		for(i = 0;i < arr.length - 1;i++) 
			for(j = 0; j < arr.length - i - 1;j++) 
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		for(i = 0;i < arr.length;i++) 
			System.out.print(arr[i] + " ");
	}
}
