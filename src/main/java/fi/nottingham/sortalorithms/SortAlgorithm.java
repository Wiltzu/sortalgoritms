package fi.nottingham.sortalorithms;


public interface SortAlgorithm {
	
	/**
	 * @param list of data
	 * @return 
	 */
	<T extends Comparable<? super T>> void sort(T[] array);
}
