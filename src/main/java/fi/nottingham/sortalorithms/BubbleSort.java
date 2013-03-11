package fi.nottingham.sortalorithms;

import java.util.Arrays;


/**
 * <p>Class uses bubble sort algorithm for sorting.</p>
 * 
 * @author Ville Ahti
 * @author Antti Laine
 *
 */
public class BubbleSort extends AbstractSortAlgorithm {

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
				}
			}
			n--;
		} while (swapped == true);
	}

}
