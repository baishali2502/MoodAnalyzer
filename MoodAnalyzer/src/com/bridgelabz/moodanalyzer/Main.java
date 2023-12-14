package com.bridgelabz.moodanalyzer;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		try {
            // Example with null message throws MOOD_NULL_OR_EMPTY error
            MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
            String result = moodAnalyser.analyseMood();
            System.out.println(result);
        } catch (MoodAnalysisException e) {
            System.err.println("Error: " + e.getError().getMessage());
        }
	}
}
