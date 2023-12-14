package com.bridgelabz.moodanalyzer;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		//creating object of MoodAnalyzer class
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(message);
        
        String result = moodAnalyser.analyseMood();
        
        System.out.println(result);  // Output: Happy or Sad

	}

}
