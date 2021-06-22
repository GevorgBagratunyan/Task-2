import java.util.ArrayList;
import java.util.List;

public class TopRatedFilms {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();

        Movie mov1 = new Movie("Terminator 1",10);
        Movie mov2 = new Movie("Terminator 2",10);
        Movie mov3 = new Movie("Terminator 3",5);
        Movie mov4 = new Movie("Terminator 4",3);
        Movie mov5 = new Movie("Terminator 5",7);

        Cartoon cart1 = new Cartoon("Tom & Jerry", 10);
        Cartoon cart2 = new Cartoon("Lion King", 9);
        Cartoon cart3 = new Cartoon("The Simpsons", 7);
        Cartoon cart4 = new Cartoon("Family Guy", 8);
        Cartoon cart5 = new Cartoon("Mickey Mouse Clubhouse", 9);
        Cartoon cart6 = new Cartoon("Chip 'n' Dale", 9);

        films.add(mov1);
        films.add(mov2);
        films.add(mov3);
        films.add(mov4);
        films.add(mov5);

        films.add(cart1);
        films.add(cart2);
        films.add(cart3);
        films.add(cart4);
        films.add(cart5);
        films.add(cart6);

        printHighRatedMovies(films);

    }

    public static void printHighRatedMovies(List<Film> films){
        int highestRating=0;

        for(Film film: films){
            if(film instanceof Movie && film.getRating()>highestRating){
                highestRating=film.getRating();
            }
        }

        for(Film film: films){
            if(film instanceof Movie && film.getRating()==highestRating){
                System.out.println(film.getTitle());
            }
        }
    }
}
