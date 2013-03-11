package fi.nottingham.sortalorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SortAlgorithmTest {

	private static final int ARRAY_LENGHT = 50000;
	private SortAlgorithm sortAlgoritm;
	private Integer[] testArray;
	
	public SortAlgorithmTest(SortAlgorithm algorithm) {
		this.sortAlgoritm = algorithm;
	}

	@Before
	public void generateTestData() {
		Random random = new Random();
		testArray = new Integer[ARRAY_LENGHT];

		for (int i = 0; i < ARRAY_LENGHT; i++) {
			testArray[i] = random.nextInt(ARRAY_LENGHT / 2);
		}
	}

	@After
	public void tearDown() throws Exception {
		testArray = null;
	}

	@Test
	public void testSort() {
		// System.out.println(Arrays.toString(testList));
		sortAlgoritm.sort(testArray);
		// System.out.println(Arrays.toString(testList));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> instancesToTest() {
		return Arrays.asList(new Object[] { new Quicksort() },
				new Object[] { new BubbleSort() });
	}

}
