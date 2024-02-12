public class Exercise {
    public static void main(String[] args) {
        Studente students1 = new Studente();
        students1.name = "Gabriel";
        students1.surname = "Dello Iacovo";
        students1.id = 68954;

        Studente students2 = new Studente();
        students2.name = "Linda";
        students2.surname = "Trenta";
        students2.id = 54687;

        System.out.println("Student1 = " + students1);
        System.out.println("Student2 = " + students2);
    }

}
