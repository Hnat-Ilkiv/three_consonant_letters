package ua.lviv.iot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConsonantLettersFinderTest {
    private ConsonantLettersFinder replace;
    private String source_text;
    private String replace_word;
    private String correctedTextFree;
    private String correctedTextFull;

    @Before
    public void setUp() {
        replace = new ConsonantLettersFinder();
        source_text = "1111 1java234 High School Musical: The Musical: The Series is an American mockumentary musical drama television series created by Tim Federle for Disney+, which was first released on November 8, 2019. The first season centers on a group of teenage theater enthusiasts (played by Olivia Rodrigo, Joshua Bassett, Matt Cornett, Sofia Wylie and others) who participate in a staging of High School Musical: The Musical as their school production. The series is set at a fictionalized version of East High School (pictured), where the original High School Musical film series was filmed. Several cast members from the film series appear in guest roles. Critics have highlighted the performances of Bassett and Rodrigo, and have compared the series to Glee for its music and themes. There has been a mixed reception to the program's mockumentary format. The series won a GLAAD Media Award and was nominated for five Children's and Family Emmy Awards. The third season premiered in July 2022; a fourth season is in production.";
        replace_word = "HelloWorld!";
        correctedTextFree = "1111 1java234 High  Musical: The Musical: The Series is an American mockumentary musical drama television series created by Tim Federle for Disney+, which was first released on November 8, 2019. The first season centers on a group of teenage theater enthusiasts (played by Olivia Rodrigo, Joshua Bassett, Matt Cornett, Sofia  and others) who participate in a staging of High  Musical: The Musical as their  production. The series is set at a fictionalized version of East High  (pictured), where the original High  Musical film series was filmed. Several cast members from the film series appear in guest roles. Critics have highlighted the performances of Bassett and Rodrigo, and have compared the series to Glee for its music and themes. There has been a mixed reception to the program's mockumentary format. The series won a GLAAD Media Award and was nominated for five Children's and Family Emmy Awards. The third season premiered in July 2022; a fourth season is in production.";
        correctedTextFull = "1111 1java234 High HelloWorld! Musical: The Musical: The Series is an American mockumentary musical drama television series created by Tim Federle for Disney+, which was first released on November 8, 2019. The first season centers on a group of teenage theater enthusiasts (played by Olivia Rodrigo, Joshua Bassett, Matt Cornett, Sofia HelloWorld! and others) who participate in a staging of High HelloWorld! Musical: The Musical as their HelloWorld! production. The series is set at a fictionalized version of East High HelloWorld! (pictured), where the original High HelloWorld! Musical film series was filmed. Several cast members from the film series appear in guest roles. Critics have highlighted the performances of Bassett and Rodrigo, and have compared the series to Glee for its music and themes. There has been a mixed reception to the program's mockumentary format. The series won a GLAAD Media Award and was nominated for five Children's and Family Emmy Awards. The third season premiered in July 2022; a fourth season is in production.";
    }

    @Test
    public void ReplaceWordWithThreeConsonantLettersNoSourceTextTest() {
        source_text = "";
        replace_word = "";
        assertNull(replace.ReplaceWordWithThreeConsonantLetters(source_text, replace_word));
    }

    @Test
    public void ReplaceWordWithThreeConsonantLettersNoReplaceWordTest() {
        replace_word = "";
        assertEquals(replace.ReplaceWordWithThreeConsonantLetters(source_text, replace_word), correctedTextFree);
    }

    @Test
    public void ReplaceWordWithThreeConsonantLettersTest() {
        assertEquals(replace.ReplaceWordWithThreeConsonantLetters(source_text, replace_word), correctedTextFull);
    }
}
