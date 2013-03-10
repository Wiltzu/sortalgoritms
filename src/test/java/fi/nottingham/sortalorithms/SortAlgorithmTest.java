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

	private static final int LIST_SIZE = 50000;
	private SortAlgorithm sortAlgoritm;
	private Integer[] testList;
	
	public SortAlgorithmTest(SortAlgorithm algorithm) {
		this.sortAlgoritm = algorithm;
	}

	@Before
	public void generateTestData() {
		Random random = new Random();
		testList = new Integer[LIST_SIZE];

		for (int i = 0; i < LIST_SIZE; i++) {
			testList[i] = random.nextInt(LIST_SIZE / 2);
		}
	}

	@After
	public void tearDown() throws Exception {
		testList = null;
	}

	@Test
	public void testSort() {
		// System.out.println(Arrays.toString(testList));
		sortAlgoritm.sort(testList);
		// System.out.println(Arrays.toString(testList));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> instancesToTest() {
		return Arrays.asList(new Object[] { new BubbleSort() },
				new Object[] { new Quicksort() });
	}

}
