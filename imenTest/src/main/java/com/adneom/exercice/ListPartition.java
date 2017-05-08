package com.adneom.exercice;

import java.util.List;

public interface ListPartition {

	/**
	 * Méthode permettant de découper une liste en sous-listes de taille "taille".
	 *
	 * @param list
	 *            Liste d'entrée à décomposer
	 * @param taille
	 *            taille des sous-listes de sortie
	 * @return Liste de sous-listes 
	 */
	List<List<Integer>> partition(List<Integer> list, int taille);
}
