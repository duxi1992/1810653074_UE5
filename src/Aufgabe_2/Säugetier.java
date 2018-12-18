package Aufgabe_2;

//Aufgabe 1
abstract class Säugetier {

   private String name;
   private int alter;
   private String geschlecht;

    protected Säugetier(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

   public abstract String printAll();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String gschlecht) {
        this.geschlecht = geschlecht;
    }
}
