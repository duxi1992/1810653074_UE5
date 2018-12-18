package Aufgabe_2;//Aufgabe 2

import Aufgabe_1.Mensch;

public class Student extends Mensch {

    // Atribute:

    private int pkz;
    private String studiengang;

    // Konstruktor

    public Student(String name, int alter, String geschlecht,int pkz,String studiengang) {

        super(name, alter, geschlecht);
        this.pkz = pkz;
        this.studiengang = studiengang;



    }

    // einen neuen Studenten anlegen

    public static void main(String [] args){

        Student a = new Student("Riccardo",26,"männlich",1810653074,"Webbusiness");

        System.out.println("Hierbei handelt es sich um einen Menschen mit dem Namen " + a.getName() + " , er ist " + a.getAlter() + " Jahre alt und " + a.getGeschlecht() + " er hat die PKZ "+ a.getPkz() + " und studiert Webbusiness");


    }

    // getter und setter

    public int getPkz() {
        return pkz;
    }

    public void setPkz(int pkz) {
        this.pkz = pkz;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
}
