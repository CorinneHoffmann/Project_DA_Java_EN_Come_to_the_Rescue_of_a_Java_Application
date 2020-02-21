package com.hemebiotech.analytics;

import java.util.List;

/**
 * The class read symptom data from a source (a file non ordered) and count for
 * every symptoms the number of patients who declare the symptom Each symptom
 * must be tested in the code.
 * 
 * @result a file contains each symptom and the associated count
 * @throws io exception 
 */

public class AnalyticsCounter {
	/*private static int headCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;*/

	public static void main(String args[]) {
			//throws Exception {
		
		List<String> symptomsList;	
		
		//try {
			ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");		
			symptomsList=reader.GetSymptoms();
			
			int i = 0;
			while (i< symptomsList.size()-1) {
				i++;
				System.out.println("symptom from file: " + symptomsList.get(i));
			}
			//BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
			//String line = reader.readLine();
			
			/*int i = 0;

			while (line != null) {
				i++;
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headCount++;
				} else if (line.equals("rush")) {
					rashCount++;
				} else if (line.contains("pupils")) {
					pupilCount++;
				}

				line = reader.readLine();
			} 
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("The file not exists or the specified path is incorrect");
		}

		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();*/
	}
}
