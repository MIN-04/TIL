package Section02;

public class Code18_2 {

	public static void main(String[] args) {
		int [] array = {10,3,5,2,6,9,7};
		
		bubbleSort(array.length, array );
	
		for(int i : array) {
			System.out.print(i+" ");
		}
	}
	
	static void bubbleSort(int n, int[] arr) {
		for(int i = n-1; i>0; i--) {
			for(int j=0; j<i; j++ ) {
				if(arr[j]>arr[j+1]) {
					swap(arr[j], arr[j+1]);
				}
			}
		}
	}
	
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}

}
