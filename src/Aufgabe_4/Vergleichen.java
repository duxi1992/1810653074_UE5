package Aufgabe_4;

import javax.swing.*;

public class Vergleichen {

    public static void main(String[] args)
    {
        //Eingabe der Zahelen
        String input1 = JOptionPane.showInputDialog("Bitte eine Zahl eingeben!");
        String input2 = JOptionPane.showInputDialog("Bitte eine Zahl eingeben!");
        String input3 = JOptionPane.showInputDialog("Bitte eine Zahl eingeben!");

        //Vergleich der Zahlen
        // gleich -> 0, ungleich negative Zahlen

        int var1 = input1.compareTo(input2);
        int var2 = input1.compareTo(input3);
        int var3 = input2.compareTo(input3);

        //Ausgabe ob gleiche Zahlen dabei
        if (var1 == 0 && var2 == 0 && var3 == 0)
        {
            System.out.println("Die zahlen stimmen überein!");
        }
        else
            System.out.println("Die Zahlen stimmen nicht überein!");
    }
}
