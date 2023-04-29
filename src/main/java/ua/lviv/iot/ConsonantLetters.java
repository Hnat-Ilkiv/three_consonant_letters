package ua.lviv.iot;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ConsonantLetters {
    private final String patternThreeConsonantLetters = "\\b[a-zA-Z&&[^aeiouAEIOU]]{3}\\w+";
    public String ReplaceWordWithThreeConsonantLetters(String sourceText, String replaceWord) {
        if (sourceText == null) return null;

        Pattern pattern = Pattern.compile(patternThreeConsonantLetters, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sourceText);
        //boolean matchFound = matcher.find();

//        if(matchFound) {
//            System.out.println("Match found");
//        } else {
//            System.out.println("Match not found");
//        }

        while (matcher.find()) {
            System.out.println("Match: " + matcher.group(0));
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
        }

        return "ready";
    }
}
