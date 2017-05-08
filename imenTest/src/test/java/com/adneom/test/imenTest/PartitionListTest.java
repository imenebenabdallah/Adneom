package com.adneom.test.imenTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.adneom.exercice.ListPartition;
import com.adneom.exercice.impl.ListPartitionImpl;

public class PartitionListTest {

	@Test
	public void testPartition() {
		ListPartition test = new ListPartitionImpl();
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<List<Integer>> listResult1 = new ArrayList<>(
				Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5)));
		List<List<Integer>> listResult2 = new ArrayList<>(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5)));
		List<List<Integer>> listResult3 = new ArrayList<>(Arrays.asList(Arrays.asList(1), Arrays.asList(2),
				Arrays.asList(3), Arrays.asList(4), Arrays.asList(5)));
		assertEquals(test.partition(list, 2), listResult1);
		assertEquals(test.partition(list, 3), listResult2);
		assertEquals(test.partition(list, 1), listResult3);

	}

}
