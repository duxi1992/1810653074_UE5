//Aufgabe 2

public class Student extends Mensch {

    private int pkz;
    private String studiengang;

    public Student(String name, int alter, String geschlecht) {

        super(name, alter, geschlecht);
        this.pkz = pkz;
        this.studiengang = studiengang;



    }

    public static void main(String [] args){

        Student a = new Student("Riccardo",26,"männlich");

        System.out.println("Hierbei handelt es sich um einen Menschen mit dem Namen " + a.getName() + " , er ist " + a.getAlter() + " Jahre alt und " + a.getGeschlecht());


    }
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
