package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class testNullMood {

	@Test
	public void test() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        try {
            assertEquals("Happy", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.MOOD_NULL_OR_EMPTY, e.getError());
        }
	}

}
