package com.lyndseypadget.interviewer;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class CloseEnoughComparator  implements Comparator<String> {
	  public int compare(String obj1, String obj2) {
	    if (obj1 == null) {
	        return -1;
	    }
	    if (obj2 == null) {
	        return 1;
	    }
	    if (obj1.equals( obj2 )) {
	        return 0;
	    }
	    
	    Collator usCollator = Collator.getInstance(Locale.US);
	    usCollator.setStrength(Collator.PRIMARY);
	    return usCollator.compare(obj1, obj2);
	  }
	}