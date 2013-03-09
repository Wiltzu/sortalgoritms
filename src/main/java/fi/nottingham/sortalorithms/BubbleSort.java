package fi.nottingham.sortalorithms;

import java.util.Arrays;


public class BubbleSort implements SortAlgorithm {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Comparable<? super T>> void sort(T[] array) {
		int n = array.length - 1;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 1; i <= n; i++) {
				// if previous is bigger than latter -> do swap
				if (array[i - 1].compareTo(array[i]) > 0) {
					swap(i-1, i, array);
					swapped = true;
					System.out.println(Arrays.toString(array));
				}
			}
			n--;
		} while (swapped == true);
	}

	private <T extends Comparable<? super T>> void swap(int previous, int latter, T[] array) {
		T tmp = array[previous];
		array[previous] = array[latter];
		array[latter] = tmp;
	}

}
