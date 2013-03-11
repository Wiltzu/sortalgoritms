package fi.nottingham.sortalorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * <p>
 * Interface test for SortAlgorithms
 * </p>
 * 
 * @author Ville Ahti
 * @author Antti Laine
 * 
 */
@RunWith(Parameterized.class)
public class SortAlgorithmTest {

	private final int arrayLenght, high;
	private SortAlgorithm sortAlgoritm;
	private Integer[] testArray;

	/**
	 * <p>
	 * Constructor for this class.
	 * </p>
	 * 
	 * @param algorithm
	 *            to use for testing
	 */
	public SortAlgorithmTest(SortAlgorithm algorithm, int arrayLenght, int high) {
		this.sortAlgoritm = algorithm;
		this.arrayLenght = arrayLenght;
		this.high = high;
	}

	/**
	 * <p>
	 * Generates data for the test
	 * </p>
	 */
	@Before
	public void generateTestData() {
		Random random = new Random();
		testArray = new Integer[arrayLenght];

		for (int i = 0; i < arrayLenght; i++) {
			testArray[i] = random.nextInt(high + 1);
		}
	}

	/**
	 * <p>
	 * Tests sort algorithm
	 * </p>
	 */
	@Test
	public void testSort() {
		// System.out.println(Arrays.toString(testList));
		sortAlgoritm.sort(testArray);
		// System.out.println(Arrays.toString(testList));
	}

	/**
	 * <p>
	 * Handles parameters for this test.
	 * </p>
	 * 
	 * @return Collection of parameters for the test constructor
	 */
	@Parameterized.Parameters
	public static Collection<Object[]> instancesToTest() {
		SortAlgorithm quickSort = new Quicksort();
		SortAlgorithm bubbleSort = new BubbleSort();
		return Arrays.asList(new Object[] { quickSort, 10000, 10000 },
				new Object[] { quickSort, 50000, 50000 }, new Object[] {
						quickSort, 100000, 100000 }, new Object[] { quickSort,
						500000, 500000 }, new Object[] { quickSort, 1000000,
						1000000 },
				new Object[] { quickSort, 10000000, 10000000 }, new Object[] {
						quickSort, 10000000, 100000000 }, new Object[] {
						quickSort, 10000000, 300000000 }, new Object[] {
						bubbleSort, 10000, 10000 }, new Object[] { bubbleSort,
						50000, 50000 }, new Object[] { bubbleSort, 100000,
						100000 });
	}

}
