package tencent;

public class FindMedianSortedArrays {
	
	public static int[] merge(int[] num1,int[] num2) {
		int[] num = new int[num1.length+num2.length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < num.length; k++) {
			if (num1[i]<num2[j]) {
				num[k] = num1[i];
				if (i+1<num1.length) {
					i++;
				}
			}else {
				num[k] = num2[j];
				if (j+1<num2.length) {
					j++;
				}
			}
		}
		return num;
	}
	
	public static double findMedian(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		if (num.length%2!=0) {
			return num[(num.length+3)/2]+0.0;
		}else {
			return (num[num.length/2-1]+num[num.length/2])/2;
		}
	}
	
	public static void main(String[] args) {
		int[] num = merge(new int[] {1,2}, new int[] {3,4});
		
		System.out.println(findMedian(num));
	}

}
