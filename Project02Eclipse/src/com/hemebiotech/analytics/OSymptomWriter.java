package com.hemebiotech.analytics;

/**
 * Anything that will read symptom data from a source (a HashMap for example)
 * and write results in a file (for example)
 * @author CorinneHoffmann
 * @version V01.00
 * 
 */
public interface OSymptomWriter {

	/**
	 * If no data in input, the file results is empty.
	 */
	void WriteSymptomsInFile();
}
