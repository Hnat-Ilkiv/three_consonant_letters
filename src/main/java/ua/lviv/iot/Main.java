package ua.lviv.iot;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        ConsonantLettersFinder replace;
        String sourceText;
        String replaceWord;
        switch (args.length) {
            case 0:
                System.out.println("Missing text and word to replace");
                break;
            case 1:
                replace = new ConsonantLettersFinder();
                sourceText = args[0];
                System.out.println(replace.ReplaceWordWithThreeConsonantLetters(sourceText, ""));
                break;
            case 2:
                replace = new ConsonantLettersFinder();
                sourceText = args[0];
                replaceWord = args[1];
                System.out.println(replace.ReplaceWordWithThreeConsonantLetters(sourceText, replaceWord));
                break;
            default:
                System.out.println("Incorrect set of arguments");
                break;
        }
    }
}