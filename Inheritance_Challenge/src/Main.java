//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String bulleIt = "Print a bulleted list:\n" +
//                "\t• First point\n" +
//                "\t\t\u2022 Second point\n";
//        System.out.println(bulleIt);
//
//        int age = 35;
//        int yearOfBirth = 2024 - age;
//        System.out.printf("Your age is: %d and your birth year is : %d", age, yearOfBirth);
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder changerBuild = new StringBuilder("Hello" + " World");
        changerBuild.append(" and Goodbye").deleteCharAt(8).insert(8, "a");

        System.out.printf("The changerBuild variable is %s", changerBuild);
     }

    public static void printInformation(StringBuilder string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }
    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }
}