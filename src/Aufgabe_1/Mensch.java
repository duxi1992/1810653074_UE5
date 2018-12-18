package Aufgabe_1;

//Aufgabe 1
public class Mensch extends Säugetier{


    protected Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    @Override
    public String printAll() {


       return getName() + " # " + getAlter() + " # " + getGeschlecht();

    }
//Aufgabe 2
 /*   public static void main(String [] args){

        Mensch a = new Aufgabe_2.Student("Riccardo",26,"männlich");

        System.out.println("Hierbei handelt es sich um einen Menschen mit dem Namen " + a.getName() + " , er ist " + a.getAlter() + " Jahre alt und " + a.getGeschlecht());

*/
    }


