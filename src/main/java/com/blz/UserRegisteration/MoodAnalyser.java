package com.blz.UserRegisteration;

import java.util.Locale;

public class MoodAnalyser {
    public String analyserMood(String mood){
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successfull";
        }else if (mood.toLowerCase().contains("sad")){
            return "Entry Failed";
        }else
            return null;
    }
}
