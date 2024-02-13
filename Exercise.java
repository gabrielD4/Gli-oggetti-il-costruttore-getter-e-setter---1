public class Exercise {
    public static void main(String[] args) {
        Studente students1 = new Studente("Gabriel", "Dello Iacovo", 68954 );
        Studente students2 = new Studente("Linda", "Trenta", 54687 );

        System.out.println("Students details = " + students1.getName() + " " + students1.getSurname() + " " + students1.getId());
        System.out.println("Students details = " + students2.getName() + " " + students2.getSurname() + " " + students2.getId());
    }

}
