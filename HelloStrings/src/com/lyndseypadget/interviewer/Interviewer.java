package com.lyndseypadget.interviewer;

class Interviewer {

	String askColorQuestion() {
		return Messages.getString("Interviewer.color.question");
	}

	String respondToColor(String color) {
		String format = Messages.getString("Interviewer.color.response");
		return String.format(format, color);
	}
}
