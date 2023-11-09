package Inlamningsuppgift1;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanObject = new Scanner(System.in); //Skapar objektet scanObject

        String stopCommand = "Stop"; // annars fortsätter loopen för evigt
        System.out.println("Skriv in text i rutan, för att avsluta skriv " + stopCommand);

        String text = null; // nödvändig i while loopen

        TextCounter textObject = new TextCounter(stopCommand); //Skapar objektet textObject

        //textObject = objekt
        while (!Objects.equals(text, stopCommand)){  //inbyggd kontroll på "Stopp"
            //^varför inte != ? att ! betyder "inte" är urkorkat, de borde betyda väldigt

            text = scanObject.nextLine(); //kollar vad du skriver i "System" rutan
            textObject.addTextLine(text); //skickar in den senaste texten i klassen

            // whileloop fortsätter tills någonting stämmer (eller inte stämmer)
        }

        int noOfLines=textObject.getNumberOfLines(); //kör metoden som skickar ut antal rader
        System.out.println("Du har skrivit in "+ noOfLines +" textrader"); //skriver ut saker i "system" rutan

        int noOfChar= textObject.getNumberOfCharacters(); //kö metoden som räknar ut antal tecken
        System.out.println("Du har använt "+ noOfChar +" tecken"); //skriver ut saker i "system" rutan
    }
}
