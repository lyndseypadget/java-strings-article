package com.lyndseypadget.interviewer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class ColorList {
	
	String getAllColors(String filename) throws FileNotFoundException, IOException {
		
		StringBuilder retVal = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filename)));
				
		for(String line; (line = br.readLine()) != null; ) {
			retVal.append(line);
			retVal.append("\n");
		}
		
		return retVal.toString();
	}
}
