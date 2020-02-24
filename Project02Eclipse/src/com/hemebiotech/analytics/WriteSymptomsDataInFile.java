package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class inherited from OSymptomWriter.
 
 * The output file is ordered by ascending symptoms.
 * It contains different symptoms and the number of persons who are
 * presented this symptom. Map is not ordered.
 * @author CorinneHoffmann
 * @version V01.00
 *
 */	
 
public class WriteSymptomsDataInFile implements OSymptomWriter {

	private String filepath;
	private Map<String, Integer> map;
	
	/**
	* @param filepath (full or partial path of file)
	* @param map (key=symptom) (value=numbers of patients) 
	*
	*/
	
	public WriteSymptomsDataInFile(String filepath, Map<String, Integer> map) {
		this.filepath = filepath;
		this.map = map;
	}

	@Override
	public void WriteSymptomsInFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

			// The Map must be sorted. It's specified.
			Map<String, Integer> sortedMap = new TreeMap<String, Integer>(map);

			for (Map.Entry<String, Integer> e : sortedMap.entrySet()) {
				writer.write(e.getKey() + " : " + e.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Le chemin spécifié du fichier n'existe pas.");
		}

	}

}
