package ua.lviv.iot;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ConsonantLetters {
    private final String patternThreeConsonantLetters = "\\b[a-zA-Z&&[^aeiouAEIOU]]{3}\\w+";
    public String ReplaceWordWithThreeConsonantLetters(String sourceText, String replaceWord) {
        if (sourceText == null || sourceText == "") return null;

        Pattern pattern = Pattern.compile(patternThreeConsonantLetters, Pattern.CASE_INSENSITIVE);

        int lastIndex = 0;
        StringBuilder output = new StringBuilder();
        Matcher matcher = pattern.matcher(sourceText);

        while (matcher.find()) {
            output.append(sourceText, lastIndex, matcher.start())
                    .append(replaceWord);

            lastIndex = matcher.end();
        }

        if (lastIndex < sourceText.length()) {
            output.append(sourceText, lastIndex, sourceText.length());
        }

        return output.toString();
    }
}
