package fi.nottingham.sortalorithms;

public class CountingSort {

	/**
	 * <p>
	 * Not in-place counting sort because it returns a new array that is sorted.
	 * </p>
	 * 
	 * @param array
	 *            to be sorted
	 * @param low
	 *            the lowest value in the <code>array</code>
	 * @param high
	 *            the highest value in the <code>array</code>
	 * @return new sorted version of the <code>array</code>
	 */
	public static int[] sort(int[] array, int low, int high) {
		// sorted array that is returned
		int[] sortedArray = new int[array.length];
		// Holds all the possible values from low to high
		int[] counts = new int[high - low + 1];

		// counts frequencies for each number in the "array"
		for (int x : array) {
			counts[x - low]++;
		}

		// counts cumulative sum for each index
		int sum = 0;
		for (int i = 0; i < counts.length; i++) {
			sum += counts[i];
			counts[i] = sum;
		}
		// iterates the "array" backwards and adds values to correct positions
		// by "counts" cumulative values
		for (int i = array.length - 1; i >= 0; i--) {
			int value = array[i]; // real value in array position
			// position counted with "value - lowest value". "--" before setting
			// the value is necessary because indexes start from 0 not 1.
			int position = --counts[value - low];
			sortedArray[position] = value; // puts value in correct position
		}

		return sortedArray;
	}
}
