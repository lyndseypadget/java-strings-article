package com.lyndseypadget.interviewer;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String BUNDLE_NAME = "com.lyndseypadget.interviewer.messages";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static Map<String, String> getStrings(String prefix) {
		Map<String, String> retVal = new HashMap<String, String>();
		
		Enumeration<String> keys = RESOURCE_BUNDLE.getKeys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			if (key.startsWith(prefix)) {
				retVal.put(key, RESOURCE_BUNDLE.getString(key));
			}
		}
		
		return retVal;
	}
}
