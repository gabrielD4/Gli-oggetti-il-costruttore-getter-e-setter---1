public class Studente {
    //These variables are private so that no one from outside can modify them.
    private String name;

    private String surname;

    private int id;

    // With this getter method I can be sure that when I create a student object it has the requested parameters.
    public Studente (String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    //With this method I can return the parameters I need from the object
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }

    // With these methods setter I'm sure that the object gets the rights parameter
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

    public Studente[] students;
}
