package com.bridgelabz.moodanalyzer;

//@desc:Takes in the message , analyses and returns Happy or Sad
public class MoodAnalyzer 
{
	private String message;

    public MoodAnalyzer(String message)
    {
        this.message = message;
    }
    
//---------------------------------------- UC-3 -------------------------------------------
    
	/*
	 * @desc:Analyses the message and accordingly returns happy or sad mood
	 * 
	 * @params:none
	 * 
	 * @returns:Happy or Sad after analysing
	 */
    public String analyseMood() throws MoodAnalysisException {
        try {
            // Check if the message is null or empty
            if (message == null || message.trim().isEmpty()) {
                // Throw MoodAnalysisException with MOOD_NULL_OR_EMPTY error
                throw new MoodAnalysisException(MoodAnalysisError.MOOD_NULL_OR_EMPTY);
            }

            // Basic criteria for determining mood
            String[] happyKeywords = {"happy", "joy", "good", "positive"};
            String[] sadKeywords = {"sad", "unhappy", "bad", "negative"};

            // Convert the message to lowercase for case-insensitive matching
            String lowerMessage = this.message.toLowerCase();

            // Check for happy keywords
            if (containsKeyword(lowerMessage, happyKeywords)) {
                return "Happy";
            }
            // Check for sad keywords
            else if (containsKeyword(lowerMessage, sadKeywords)) {
                return "Sad";
            }
            // If no keywords match, return undetermined mood
            else {
                return "Undetermined";
            }
        } catch (Exception e) {
            // Handle other exceptions here if needed
            throw new MoodAnalysisException(MoodAnalysisError.OTHER_ERROR, e.getMessage());
        }
    }
    
	/*
	 * @desc:This method checks if given message contains certain keywords or not
	 * 
	 * @params:message and the keywords
	 * 
	 * @returns:boolean
	 */
    
    private boolean containsKeyword(String message, String[] keywords) {
        for (String keyword : keywords) {
            if (message.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
