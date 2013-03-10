package fi.nottingham.sortalorithms;

public abstract class AbstractSortAlgorithm implements SortAlgorithm {

	protected <T extends Comparable<? super T>> void swap(int first,
			int second, T[] array) {
		T tmp = array[first];
		array[first] = array[second];
		array[second] = tmp;
	}

}