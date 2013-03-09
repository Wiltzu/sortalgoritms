package fi.nottingham.sortalorithms;

import java.util.Collection;

public interface SortAlgorithm<T> {
	Collection<T> sort(Collection<T> collection);
}
