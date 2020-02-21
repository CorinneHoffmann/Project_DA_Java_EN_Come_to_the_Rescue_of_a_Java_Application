package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* this class transform a list in map. 
* the entry parameter list is no necessary ordered. Accept a String List
* return a Map <String,Integer> with the type of symptom and the number of patients associated 
* if Lit is empty, Map is empty
*/

public class TransformListMap {

	private List<String> symptomsList ;
			
	public TransformListMap (List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	public Map<String,Integer> TransformListInDictionnary () {
		Map<String,Integer> result = new HashMap<String,Integer>();
		return result;
	}
}