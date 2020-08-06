package class04.sort.insection;

public class insectionSort {

	public static void main(String[] args) {
		int[] num = {8,5,6,2,4};
		int length = num.length;
		
		for(int i=1;i<length;i++) {
			int value = num[i];
			int key = i;
			for(int j=i-1;j>=0;j--) {
				if(value<num[j]) {
					num[j+1] = num[j];
					key = j;
				}
			}
			num[key] = value;
		}
		
		for(int m : num) {
			System.out.print(m);
		}
	}

}

