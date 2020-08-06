package class02.sort.selection;

public class selectionSort {

	public static void main(String[] args) {
		int[] num = {2,3,5,4,1};
		
		int min, temp, index=0;
		int length = num.length;
		
		for(int i=0; i<length; i++) {
			min = 999;
			for(int j=i; j<length; j++) {
				if(min>num[j]) {
					min = num[j];
					index = j;
				}
			}
			
			temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
		
		for(int m : num) {
			System.out.print(m);
		}
	}

}
