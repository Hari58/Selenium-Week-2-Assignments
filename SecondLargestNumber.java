package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		//System.out.println(data.length);
		int arraySize = data.length;
		Arrays.sort(data);
		System.out.println(data[arraySize-2]);

	}

}
