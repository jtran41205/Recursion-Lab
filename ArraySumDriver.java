public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/*
	 *@author Jill Tran
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];

		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;//36

		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);

		myArray[index++] = 7;
		myArray[index++] = 1;//44

		sum = sumOfArray(myArray, 5);
		System.out.println(sum);

		System.out.println(fibby(3));
		System.out.println(fibby(2));
		System.out.println(fibby(7));

	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) {
		if(num == 0){
			return arr[num];
		}
		else{
			return arr[num] + sumOfArray(arr, num-1);
		}
	}

	public static Integer sumOfArray(Integer[] arr) {
		Integer total = 0;
		for (Integer integer : arr) {
			total += integer;
		}
		return total;
	}

	public static int fibby(int n){
		if (n <= 1){
			return n;
		}
		return fibby(n-1) + fibby(n-2);
	}
}