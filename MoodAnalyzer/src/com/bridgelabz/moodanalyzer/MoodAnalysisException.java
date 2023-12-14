package com.bridgelabz.moodanalyzer;

/* @desc:Custom MoodAnalysisException with an enum to differentiate different mood analysis errors, 
         including the case of a null or empty mood.
*/
public class MoodAnalysisException extends Exception {
    private final MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error) {
        super(error.getMessage());
        this.error = error;
    }

    public MoodAnalysisException(MoodAnalysisError error, String message) {
        super(message);
        this.error = error;
    }

    public MoodAnalysisError getError() {
        return error;
    }
}
