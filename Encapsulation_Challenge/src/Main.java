import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
//        theMovie.watchMovie();
//        Movie theMovie2 = Movie.getMovie("Funny", "Hangover");
//        theMovie2.watchMovie();

//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter type (A for Adventure, F for Funny and "+
//                    "S for Science Fiction, or Q to quit): ");
//            String type = s.nextLine();
//            if("Qq".contains(type)){
//                break;
//            }
//            System.out.println("Enter the Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }
//        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
//        jaws.watchMovie();
//
//        var airplane = Movie.getMovie("F", "Airplane");
//        airplane.watchMovie();
//
//        var plane = new Funny("Airplane");
//        plane.watchMovie();

        Object unknownObject = Movie.getMovie("F", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Funny") {
            Funny f = (Funny) unknownObject;
            f.watchMovie();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchMovie();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchMovie();
        }
    }
}