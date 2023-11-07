package Inlamningsuppgift1;

public class TextCounter {

    private String textEntry = ""; //Attribut för hela texten
    private int lineCount = 0; // Attribut som räknas upp för varje text
    private int endCommandLength;  // Attribut för stoppordets längd

    //Konstruktor = TextCounter
    public TextCounter (String terminationCommand) {
        endCommandLength = terminationCommand.length();
    }

   //Metod som lägger till en textrad
    public void addTextLine(String text) {
        lineCount = lineCount+1;
        textEntry = textEntry + text;
    }

    //Metod som skickar ut antal inskrivna rader
    public int getNumberOfLines(){
        return lineCount-1;
    }

    //Metod som räknar antal tecken
    public int getNumberOfCharacters(){
        int charCount = textEntry.length();
        charCount = charCount-endCommandLength;
        return charCount;
    }

    //Metod som skickar ut hela inmatade texten inklusive stoppordet
    public String getTotalText(){
        return textEntry;
    }

}
