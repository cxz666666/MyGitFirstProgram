package test;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 * 
 * @author cxz
 *
 */
public class Arrays {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 7, 11, 13 };
		int num = 9;
		int[] indexs = getIndexOfNum2(array, num);
		if (indexs == null) {
			System.out.print("Not Found!\n");
		} else
			System.out.print(indexs[0] + ", " + indexs[1]);
	}

	public static int[] getIndexOfNum(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] + array[j] == num) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static int[] getIndexOfNum2(int[] array, int num) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (hashMap.get(array[i]) != null) {
				return new int[] { hashMap.get(array[i]), i };
			} else {
				hashMap.put(num - array[i], j);
				j++;
			}
		}
		return null;
	}
}
