package fi.nottingham.sortalorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * <p>
 * Test class for CountingSort class.
 * </p>
 * 
 * @author Ville Ahti
 * @author Antti Laine
 * 
 */
@RunWith(Parameterized.class)
public class CountingSortTest {

	private static final int LOW = 0;
	private final int high, arrayLength;
	int[] testArray;

	public CountingSortTest(int arrayLength, int high) {
		this.high = high;
		this.arrayLength = arrayLength;
	}

	/**
	 * <p>
	 * Generates test data.
	 * </p>
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		Random random = new Random();
		testArray = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			testArray[i] = random.nextInt(high + 1);
		}

	}

	/**
	 * <p>
	 * Tests counting sort algorithm.
	 * </p>
	 */
	@Test
	public void testSort() {
		// System.out.println(Arrays.toString(testArray));
		int[] sortedArray = CountingSort.sort(testArray, LOW, high);
		// System.out.println(Arrays.toString(sortedArray));
	}

	/**
	 * <p>
	 * Generates parameters for this test.
	 * </p>
	 * 
	 * @return collection of parameters for the test constructor
	 */
	@Parameterized.Parameters
	public static Collection<Object[]> instancesToTest() {
		return Arrays.asList(new Object[] { 10000, 10000 }, new Object[] {
				50000, 50000 }, new Object[] { 100000, 100000 }, new Object[] {
				500000, 500000 }, new Object[] { 1000000, 1000000 },
				new Object[] { 10000000, 10000000 }, new Object[] { 10000000,
						100000000 }, new Object[] { 10000000, 300000000 });
	}

}
