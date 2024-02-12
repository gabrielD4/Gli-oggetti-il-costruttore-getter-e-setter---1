public class Studente {
    public String name;

    public String surname;

    public int id;

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
