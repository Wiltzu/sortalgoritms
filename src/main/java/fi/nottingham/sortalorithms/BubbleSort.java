package fi.nottingham.sortalorithms;

import java.util.Collection;

public class BubbleSort<T> implements SortAlgorithm<T> {
	
	private T[] array;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> sort(Collection<T> collection) {
		array = (T[]) collection.toArray();
		
		
		
		return null;
	}
	
	private void swap(int index) {
		int previousIndex = index-1;
		T tmp = array[index];
		array[index] = array[previousIndex];
		array[previousIndex] = tmp;
	}

}
