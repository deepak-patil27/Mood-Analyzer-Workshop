package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
    public void givenMessageWhenSad_ShouldReturnSad()
    {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is a Sad Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessageWhenNotSad_ShouldReturnHappy()
    {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is a Happy Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy()
    {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

	

}
