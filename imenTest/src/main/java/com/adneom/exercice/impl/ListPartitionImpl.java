package com.adneom.exercice.impl;

import java.util.ArrayList;
import java.util.List;

import com.adneom.exercice.ListPartition;

/**
 * The Class ListPartitionImpl.
 */
public class ListPartitionImpl implements ListPartition {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adneom.exercice.ListPartition#partition(java.util.List, int)
	 */
	public List<List<Integer>> partition(List<Integer> list, int taille) {
		int n = list.size();
		List<List<Integer>> result = new ArrayList<>();

		int j = 0;
		boolean fin = false;
		while (j < n && !fin) {
			List<Integer> subList = new ArrayList<>();
			if (j + taille > n) {
				fin = true;
				break;
			}
			subList = list.subList(j, j + taille);

			j += taille;
			result.add(subList);
		}
		if (j < n) {
			List<Integer> lastSubList = new ArrayList<>();
			lastSubList = list.subList(j, n);
			result.add(lastSubList);
		}

		return result;
	}
}
