package fi.nottingham.sortalorithms;


/**
 * <p>Strategy inteface for sort algorithms.</p>
 * 
 * @author Ville Ahti
 * @author Antti Laine
 *
 */
public interface SortAlgorithm {
	
	/**
	 * <p>Generic sort method for sorting algoritms.</p>
	 * 
	 * @param list of data
	 */
	<T extends Comparable<? super T>> void sort(T[] array);
}
