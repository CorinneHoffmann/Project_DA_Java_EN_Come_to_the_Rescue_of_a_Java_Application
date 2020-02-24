package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The class read symptom data from a source, (a file non ordered) and write a file ordered.
 * 
 * @author CorinneHoffmann
 * @version V01.00
 */

public class DataAnalyse {

	private String inputFilePath;
	private String outputFilePath;
	
	/**
	 * The class read symptom data from a source, (a file non ordered) and write a file ordered.
	 * @param inputFilePath is the name of input file partial or complete path
	 * @param outputFilePath (Output Data) partial or complete path
	 *
	 */
	
	public DataAnalyse(String inputFilePath,String outputFilePath) {
		this.inputFilePath = inputFilePath;
		this.outputFilePath = outputFilePath;
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
		
		ISymptomReader reader = new ReadSymptomDataFromFile(inputFilePath);
		symptomsList = reader.GetSymptoms();
		
		TransformListMap transformListMap = new TransformListMap(symptomsList);
		symptomsDictionnary = transformListMap.TransformListInDictionnary();
		
		OSymptomWriter writer = new WriteSymptomsDataInFile(outputFilePath, symptomsDictionnary);
		writer.WriteSymptomsInFile();
	}
}