package com.hemebiotech.analytics;

/**
 * The class read symptom data from a source (a file non ordered) and write results
 * in  a file ordered.
 * 
 */

public class AnalyticsCounter {

	public static void main(String args[]) {
		
		DataAnalyse analyse = new DataAnalyse ("symptoms.txt","result.txt");
		analyse.TreatData();
		
	}
}
