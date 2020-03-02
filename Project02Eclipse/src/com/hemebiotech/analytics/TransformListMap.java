package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this class transform a list in map. the entry parameter list is no necessary
 * ordered. Accept a String List return a Map with the type of
 * symptom and the number of patients associated if Lit is empty, Map is empty
 * 
 * @author CorinneHoffmann
 * @version V01.00
 */

public class TransformListMap {

	private List<String> symptomsList;

	/**
	* @param symptomsList is a List of String (contains symptoms and numbers of patients 
	* 
	*/
			 
	public TransformListMap(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	/**
	* @return Map (String, Integer)
	* 	 
	*/
						
	public Map<String, Integer> transformListInDictionnary() {
		Map<String, Integer> result = new HashMap<String, Integer>();

		// we sort the List because we must manage a read break
		Collections.sort(symptomsList);

		try {
			int i = 0;
			int compteur = 1;
			String a = symptomsList.get(i);
			String b;
			if (symptomsList.size() != 1) {

				do {
					i++;
					b = symptomsList.get(i);
					if (a.compareTo(b) != 0) {
						result.put(a, compteur);
						compteur = 1;
						a = symptomsList.get(i);
					} else {
						compteur += 1;
					}

				} while (i < symptomsList.size() - 1);
			}

			// we must put in dictionary the last List Value
			result.put(symptomsList.get(i), compteur);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("La list est vide");
		}
		return result;
	}
}
