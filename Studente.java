public class Studente {
    private final String name;

    private final String surname;

    private final int id;

    public Studente (String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
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
