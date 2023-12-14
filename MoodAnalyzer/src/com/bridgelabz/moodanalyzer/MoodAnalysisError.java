package com.bridgelabz.moodanalyzer;

// @desc: enum MoodAnalysisError differentiates different types of errors
public enum MoodAnalysisError 
{
	MOOD_NULL_OR_EMPTY("Mood is null or empty."),
    OTHER_ERROR("Unexpected error occurred.");

    private final String message;

    MoodAnalysisError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
