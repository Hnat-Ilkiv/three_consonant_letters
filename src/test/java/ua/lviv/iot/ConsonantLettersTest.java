package ua.lviv.iot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class ConsonantLettersTest {
    private ConsonantLetters replace;
    private String source_text;
    private String replace_word;
    private String correctedText;

    @Before
    public void setUp() {
        replace = new ConsonantLetters();
        source_text = "High School Musical: The Musical: The Series is an American mockumentary musical drama television series created by Tim Federle for Disney+, which was first released on November 8, 2019. The first season centers on a group of teenage theater enthusiasts (played by Olivia Rodrigo, Joshua Bassett, Matt Cornett, Sofia Wylie and others) who participate in a staging of High School Musical: The Musical as their school production. The series is set at a fictionalized version of East High School (pictured), where the original High School Musical film series was filmed. Several cast members from the film series appear in guest roles. Critics have highlighted the performances of Bassett and Rodrigo, and have compared the series to Glee for its music and themes. There has been a mixed reception to the program's mockumentary format. The series won a GLAAD Media Award and was nominated for five Children's and Family Emmy Awards. The third season premiered in July 2022; a fourth season is in production.";
        replace_word = "HelloWorld!";
        correctedText = "High School Musical: The Musical: The Series is an American mockumentary musical drama television series created by Tim Federle for Disney+, which was first released on November 8, 2019. The first season centers on a group of teenage theater enthusiasts (played by Olivia Rodrigo, Joshua Bassett, Matt Cornett, Sofia Wylie and others) who participate in a staging of High School Musical: The Musical as their school production. The series is set at a fictionalized version of East High School (pictured), where the original High School Musical film series was filmed. Several cast members from the film series appear in guest roles. Critics have highlighted the performances of Bassett and Rodrigo, and have compared the series to Glee for its music and themes. There has been a mixed reception to the program's mockumentary format. The series won a GLAAD Media Award and was nominated for five Children's and Family Emmy Awards. The third season premiered in July 2022; a fourth season is in production.";
    }

    @Test
    public void ReplaceWordWithThreeConsonantLettersNoSourceText() {
        source_text = null;
        replace_word = null;
        assertNull(replace.ReplaceWordWithThreeConsonantLetters(source_text, replace_word));
    }

    @Test
    public void ReplaceWordWithThreeConsonantLettersNoReplaceWord() {
        replace_word = null;
        replace.ReplaceWordWithThreeConsonantLetters(source_text,replace_word);
    }

    @Test
    public void ReplaceWordWithThreeConsonantLetters() {

    }
}
