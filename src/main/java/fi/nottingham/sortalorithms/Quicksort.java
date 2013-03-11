package fi.nottingham.sortalorithms;


/**
 * <p>Class uses quicksort algorithm for sorting.</p>
 * 
 * @author Ville Ahti
 * @author Antti Laine
 *
 */
public class Quicksort extends AbstractSortAlgorithm {

	@Override
	public <T extends Comparable<? super T>> void sort(T[] array) {
		quicksort(array, 0, array.length - 1);
	}

	/**
	 * <p>
	 * Implements the recursive quicksort algorithm.
	 * </p>
	 * 
	 * @param array
	 *            of data
	 * @param left
	 *            the leftmost value of this part of an array
	 * @param right
	 *            rightmost value of this part of an array
	 */
	private <T extends Comparable<? super T>> void quicksort(T[] array,
			int left, int right) {
		// if the list has two or more items
		if (left < right) {
			// Choice of pivot
			int pivotIndex = left + (right - left) / 2;

			// lists of bigger and smaller items and final position of pivot
			int pivotNewIndex = partition(array, left, right, pivotIndex);

			// Recursively sort elements smaller than the pivot
			quicksort(array, left, pivotNewIndex - 1);

			// Recursively sort elements at least as big as the pivot
			quicksort(array, pivotNewIndex + 1, right);
		}
	}

	/**
	 * <p>
	 * Implements partition algorithm for quicksort.
	 * </p>
	 * 
	 * 
	 * @param array
	 *            of data
	 * @param left
	 *            leftmost value of this part of an array
	 * @param right
	 *            rightmost value of this part of an array
	 * @param pivotIndex
	 *            old pivot index
	 * @return new pivot index
	 */
	private <T extends Comparable<? super T>> int partition(T[] array,
			int left, int right, int pivotIndex) {
		// Store pivot value
		final T pivotValue = array[pivotIndex];
		// move pivot to end (rightmost index)
		swap(pivotIndex, right, array);
		int storeIndex = left;
		// from left to right - 1
		for (int i = left; i < right; i++) {
			// compare values of indexes pivot and i
			// if(i < pivot) -> swap i and storeIndex
			// increase value of storeIndex
			if (array[i].compareTo(pivotValue) < 0) {
				swap(i, storeIndex, array);
				storeIndex++;
			}
		}
		// Move pivot to its final position
		swap(storeIndex, right, array);
		return storeIndex;
	}

}
