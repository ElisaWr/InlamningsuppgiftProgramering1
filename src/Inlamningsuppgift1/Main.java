package Inlamningsuppgift1;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Skriv ett program som läser in text ifrån
        kommandoraden rad för rad tills användaren
        skriver ordet Stop.*/

        Scanner scan = new Scanner(System.in); //öppnar dörren till ett annat rum
        //scan = objekt
        String stopCommand = "Stop"; // annars fortsätter loopen för evigt
        System.out.println("Skriv in text i rutan, för att avsluta skriv " + stopCommand);

        String text = null; // nödvändig i while loopen

        TextCounter textObject = new TextCounter(stopCommand); //öppnar dörren till rummet textcounter
        //textObject = objekt
        while (!Objects.equals(text, stopCommand)){  //inbyggd kontroll på "Stopp"
            //^varför inte != ? att ! betyder "inte" är urkorkat, de borde betyda väldigt
            text = scan.nextLine(); //kollar vad du skriver i "System" rutan
            textObject.addTextLine(text); //puttar in den senaste texten i det andra rummet
            // whileloop fortsätter tills någonting stämmer (eller inte stämmer)
        }
        int noOfLines=textObject.getNumberOfLines();
        System.out.println("Du har skrivit in "+ noOfLines +" textrader"); //skriver ut saker i "system" rutan
        int noOfChar= textObject.getNumberOfCharacters(); //skriver ut saker i "system" rutan
        System.out.println("Du har använt "+ noOfChar +" tecken");
    }
}
