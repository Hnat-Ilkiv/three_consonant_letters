package ua.lviv.iot;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ConsonantLettersFinder {
  public static final String PATTERN_THREE_CONSONANT_LETTERS = "\\b[a-zA-Z&&[^aeiouAEIOU]]{3}\\w+";
  public static final Pattern PATTERN = Pattern.compile(PATTERN_THREE_CONSONANT_LETTERS, Pattern.CASE_INSENSITIVE);
    public String ReplaceWordWithThreeConsonantLetters(final String sourceText, final String replaceWord) {
        if (sourceText ==  null || sourceText == "") {
            return null;
        }

        int lastIndex = 0;
        StringBuilder output = new StringBuilder();
        Matcher matcher = PATTERN.matcher(sourceText);

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
