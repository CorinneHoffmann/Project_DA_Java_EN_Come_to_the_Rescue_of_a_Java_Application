package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The class read symptom data from a source (a file non ordered) and count for
 * every symptoms the number of patients who declare the symptom The results are
 * written in a file
 *
 */

public class AnalyticsCounter {

	public static void main(String args[]) {

		List<String> symptomsList;
		Map<String, Integer> symptomsDictionnary;
		;

		// The constructor need a parameter filepath and the method GetSymptom return a List<String>
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		symptomsList = reader.GetSymptoms();

		// The constructor need a parameter List<String> and the method TransformListMap return a Map
		TransformListMap transformListMap = new TransformListMap(symptomsList);
		symptomsDictionnary = transformListMap.TransformListInDictionnary();

		// The constructor need two parameters filepath and map. The method WriteSymptomsInFile is void
		OSymptomWriter writer = new WriteSymptomsDataInFile("Fichiers/result.txt", symptomsDictionnary);
		writer.WriteSymptomsInFile();
	}
}
