package Inlamningsuppgift1;

public class TextCounter {

    /*När användaren är klar skriver programmet ut
    antal tecken och hur många rader som
    användaren har skrivit, exklusive raden med
    ordet stop*/

    /*Programmet skall bestå av två klasser:
    ❖ En klass som läser in text och skriver ut
    resultatet till användaren (Main)
    ❖ En annan klass som räknar raderna och har
    koll på antalet tecken (TextCounter)
    ❖ Kontrollen för att ha koll på om användaren
    har skrivit ordet stop eller inte får utföras i
    vilken av klasserna man vill*/
    private String textEntry = ""; //Attribut = textEntry
    private int lineCount = 0; // Attribut = lineCount
    private String endCommand;  // Attribut
    private int endCommandLength;  // Attribut

    public TextCounter (String terminationCommand) { //Konstruktor = TextCounter
        endCommand = terminationCommand;
        endCommandLength = endCommand.length();
    }

    public void addTextLine(String text) {

        //System.out.println(textEntry); //TESTLINE
        lineCount = lineCount+1;
        textEntry = textEntry + text;
    }

    public int getNumberOfLines(){
        //System.out.println("Du har skrivit in "+ (lineCount-1) +" textrader");
        return lineCount-1;
    }

    //public void printNumberOfCharacters(){
    public int getNumberOfCharacters(){
        int charCount = textEntry.length();
        charCount = charCount-endCommandLength;
        //System.out.println("Du har använt "+ charCount +" tecken");
        //System.out.println(textEntry); //TESTLINE
        return charCount;
    }
    public String getTotalText(){
        //System.out.println("Du har skrivit in "+ (lineCount-1) +" textrader");
        return textEntry;
    }

}
