package ua.lviv.iot;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        ConsonantLetters replace = new ConsonantLetters();

        System.out.println("Enter the text you want: ");
        String sourceText = scan.nextLine();

        System.out.println("Type the word insert: ");
        String replaceWord = scan.nextLine();

        String result = replace.ReplaceWordWithThreeConsonantLetters(sourceText, replaceWord);

        System.out.println(result);
    }
}