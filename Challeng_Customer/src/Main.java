//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Customer custom = new Customer();
//        Customer first = new Customer("Ovais Kareem", "alikareem24@gmail.com");
//        System.out.println(custom.getCreditLimit() + " This is the credit limit for default");
//        System.out.println(first.getCreditLimit() + " This is the credit limit for first");

        for (int i = 0; i < 5; i++) {
            LPAStudent st = new LPAStudent("43313" + i,
                    switch (i) {
                        case 0 -> "Mary";
                        case 1 -> "George";
                        case 2 -> "Luther";
                        case 3 -> "Gregory";
                        case 4 -> "Erikson";
                        default -> "Anonymous";
                    }, "11/02/2024", "Java Learner");
            System.out.println(st);
        }
        Student ordinary = new Student("22461", "Samantha", "13/6/1999", "Motivator");
        LPAStudent newStudent = new LPAStudent("55734", "Bill", "21/03/2003", "Location engineering");

        System.out.println(ordinary);
        System.out.println(newStudent);

        System.out.println(ordinary.getName() + " is taking "
        + ordinary.getClassList());
        System.out.println(newStudent.name() + " is taking " + newStudent.classList())  ;
    }
}