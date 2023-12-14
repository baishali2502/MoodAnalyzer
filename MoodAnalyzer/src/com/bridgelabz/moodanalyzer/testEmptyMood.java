package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEmptyMood
{
	@Test
	public void test()
	{
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
        try {
            assertEquals("Happy", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.MOOD_NULL_OR_EMPTY, e.getError());
        }
	}
}
