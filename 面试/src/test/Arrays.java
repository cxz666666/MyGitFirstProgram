package test;

import java.util.HashMap;

public class Arrays {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 7, 11, 13 };
		int num = 9;
		int[] indexs = getIndexOfNum2(array, num);
		if(indexs == null) {
			System.out.print("Not Found!\n");
		}else
			System.out.print(indexs[0] + ", " + indexs[1]);
	}

	public static int[] getIndexOfNum(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] + array[j] == num) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}
	
	public static int[] getIndexOfNum2(int[] array, int num) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int j=0;
		for(int i=0; i<array.length; i++) {
			if(hashMap.get(array[i]) != null) {
				return new int[]{hashMap.get(array[i]), i};
			}else {
				hashMap.put(num-array[i], j);
				j++;
			}
		}
		return null;
	}
}
