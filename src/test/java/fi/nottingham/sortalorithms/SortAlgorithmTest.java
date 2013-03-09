package fi.nottingham.sortalorithms;

import static org.junit.Assert.fail;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortAlgorithmTest {
	
	private static final int LIST_SIZE = 5;
	private SortAlgorithm sortAlgoritm;
	private Integer[] testList;

	@Before
	public void setUp() throws Exception {
		sortAlgoritm = new BubbleSort();
	}
	
	@Before
	public void generateTestData() {
		Random random = new Random();
		testList = new Integer[LIST_SIZE];
		
		for(int i = 0; i < LIST_SIZE; i++) {
			testList[i] = random.nextInt(LIST_SIZE);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		System.out.println(Arrays.toString(testList));
		sortAlgoritm.sort(testList);
		System.out.println(Arrays.toString(testList));
	}

}
