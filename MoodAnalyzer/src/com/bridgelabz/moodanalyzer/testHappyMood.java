package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class testHappyMood {

	@Test
	public void test() 
	{
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am feeling happy and positive today.");
        try 
        {
            assertEquals("Happy", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
	}

}
