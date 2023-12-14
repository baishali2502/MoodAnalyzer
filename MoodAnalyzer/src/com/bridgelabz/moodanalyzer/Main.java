package com.bridgelabz.moodanalyzer;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		// Example usage:
        try {
            // Example with null message treated as "Happy"
            MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
            String result = moodAnalyser.analyseMood();
            System.out.println(result);  // Output: Happy
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
	}

}
