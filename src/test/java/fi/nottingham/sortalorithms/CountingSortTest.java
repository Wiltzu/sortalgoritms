package fi.nottingham.sortalorithms;

import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountingSortTest {
	
	private static final int LOW = 0, HIGH = 10, ARRAY_LENGHT = 10;
	int[] testArray;

	@Before
	public void setUp() throws Exception {
		Random random = new Random();
		testArray = new int[ARRAY_LENGHT];

		for (int i = 0; i < ARRAY_LENGHT; i++) {
			testArray[i] = random.nextInt(HIGH);
		}
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		System.out.println(Arrays.toString(testArray));
		int[] sortedArray = CountingSort.sort(testArray, LOW, HIGH);
		System.out.println(Arrays.toString(sortedArray));
	}

}
