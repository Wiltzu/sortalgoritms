package fi.nottingham.sortalorithms;

/**
 * <p>
 * Abstract class for sorting algorithms. This class implements only the swap
 * method which is common for many sort algorithms.
 * </p>
 * 
 * @author Ville Ahti
 * @author Antti Laine
 * 
 */
public abstract class AbstractSortAlgorithm implements SortAlgorithm {

	/**
	 * <p>Swap values first and second in the array.</p>
	 * 
	 * @param first
	 *            index of array
	 * @param second
	 *            index of array
	 * @param array
	 *            which values to be swapped
	 */
	protected <T extends Comparable<? super T>> void swap(int first,
			int second, T[] array) {
		T tmp = array[first];
		array[first] = array[second];
		array[second] = tmp;
	}

}