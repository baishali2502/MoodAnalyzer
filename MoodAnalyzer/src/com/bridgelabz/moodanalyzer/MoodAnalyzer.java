package com.bridgelabz.moodanalyzer;

//@desc:Takes in the message , analyses and returns Happy or Sad
public class MoodAnalyzer 
{
	private String message;

    public MoodAnalyzer(String message)
    {
        this.message = message;
    }
    
//---------------------------------------- UC-1 -------------------------------------------
    
	/*
	 * @desc:Analyses the message and accordingly returns happy or sad mood
	 * 
	 * @params:none
	 * 
	 * @returns:Happy or Sad after analysing
	 */
    public String analyseMood() 
    {
        // Basic criteria for determining mood
        String[] happyKeywords = {"happy", "any"};
        String[] sadKeywords = {"sad"};

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
