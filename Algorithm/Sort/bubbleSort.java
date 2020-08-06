package class03.sort.bubble;

public class bubbleSort {

	public static void main(String[] args) {
		int[] num = {2,3,5,4,1};
		
		int temp;
		int length = num.length;
		
		for(int i=1; i<length; i++) {
			for(int j=0;j<length-i;j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for(int m : num) {
			System.out.print(m);
		}
	}

}

