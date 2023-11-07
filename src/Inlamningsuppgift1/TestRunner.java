package Inlamningsuppgift1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    //test 1. tar den emot texten och sparar den korrekt
    @Test
    public void addTextLineTest(){

        //Arrange
        TextCounter textObject = new TextCounter("Stop");
        String expected = "abcdefghijklStop";

        //Act
        textObject.addTextLine("abcd");
        textObject.addTextLine("efgh");
        textObject.addTextLine("ijkl");
        textObject.addTextLine("Stop");
        String actual = textObject.getTotalText();

        //Assert
        assertEquals(expected,actual);
    }

    // test 2. räknar den rätt antal rader.
    @Test
    public void numberOfLinesTest(){

        //Arrange
        TextCounter textObject = new TextCounter("Stop");
        int expected = 3;

        //Act
        textObject.addTextLine("rad 1");
        textObject.addTextLine("rad 2");
        textObject.addTextLine("rad 3");
        textObject.addTextLine("Stop");
        int actual = textObject.getNumberOfLines();

        //Assert
        assertEquals(expected,actual);
    }

    // test 3. räknar den rätt antal tecken.
    @Test
    public void numberOfCharacterTest(){

        //Arrange
        TextCounter textObject = new TextCounter("Stop");
        int expected = 10;

        //Act
        textObject.addTextLine("rad 1");
        textObject.addTextLine("rad 2");
        textObject.addTextLine("Stop");
        int actual = textObject.getNumberOfCharacters();

        //Assert
        assertEquals(expected,actual);
    }

    // test 4. accepterar den konstiga tecken och räknar dem rätt.
    @Test
    public void typeOfCharacterTest() {

        //Arrange
        TextCounter textObject = new TextCounter("Stop");
        int expected = 20;

        //Act
        textObject.addTextLine("*^>3  _  5");
        textObject.addTextLine("2^3+5//À½|");
        textObject.addTextLine("Stop");
        int actual = textObject.getNumberOfCharacters();

        //Assert
        assertEquals(expected, actual);
    }
}
