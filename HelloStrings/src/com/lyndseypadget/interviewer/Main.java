package com.lyndseypadget.interviewer;

import java.io.IOException;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		String s1 = "bleu fonce";
		String s2 = "Bleu foncé    ";
		
		Comparator<String> comparator = new CloseEnoughComparator();
		if(comparator.compare(s1, s2) == 0) {
			System.out.println("s1 and s2 have equal values");
		}
		else {
			System.out.println("s1 and s2 do NOT have equal values");
		}
	}
};