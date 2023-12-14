package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSadMood {

	@Test
	public void test() 
	{
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I don't know how I feel today.");
        try {
            assertEquals("Undetermined", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
	}

}
