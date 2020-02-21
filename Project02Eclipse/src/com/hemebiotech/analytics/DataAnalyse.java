package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The class read symptom data from a source, (a file non ordered) and write a file ordered.
 * @param two parameters inputfilepath (input Data) and outputfilepath (Output Data)
 */

public class DataAnalyse {

	private String inputfilepath;
	private String outputfilepath;
	

	public DataAnalyse(String inputfilepath,String outputfilepath) {
		this.inputfilepath = inputfilepath;
		this.outputfilepath = outputfilepath;
	}
	
	/**
	 * The method TreatData, transformed a input file in List
	 * then transformed a List to Map  
	 * and write the map in a file
	 *
	 */	
	
	public void TreatData() {
		List<String> symptomsList;
		Map<String, Integer> symptomsDictionnary;
		
		ISymptomReader reader = new ReadSymptomDataFromFile(inputfilepath);
		symptomsList = reader.GetSymptoms();
		
		TransformListMap transformListMap = new TransformListMap(symptomsList);
		symptomsDictionnary = transformListMap.TransformListInDictionnary();
		
		OSymptomWriter writer = new WriteSymptomsDataInFile(outputfilepath, symptomsDictionnary);
		writer.WriteSymptomsInFile();
	}
}