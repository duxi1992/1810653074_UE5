package Aufgabe_2;

//Aufgabe 1
public class Mensch extends Säugetier {


    protected Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);

    }

    @Override
    public String printAll() {


        return getName() + " # " + getAlter() + " # " + getGeschlecht();

    }


    //Aufgabe 2

    public String status() {


       return "Hierbei handelt es sich um einen Menschen mit dem Namen " + getName() + " , er ist " + getAlter() + " Jahre alt und " + getGeschlecht();


    }
}

