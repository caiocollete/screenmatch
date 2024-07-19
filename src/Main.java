import com.caio.screenmatch.calc.CalculateTime;
import com.caio.screenmatch.calc.FilterRecomendation;
import com.caio.screenmatch.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("O poderoso chefão",1970);
        movie.setRating(10);
        movie.setRating(5);
        movie.setRating(7);
        movie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + movie.getDurationInMinutes());

        Movie movie2 = new Movie("O poderoso chefão 2",1980);
        movie.setRating(8);
        movie.setRating(2);
        movie.setRating(9);
        movie2.setDurationInMinutes(200);
        System.out.println("Duração do filme: " + movie2.getDurationInMinutes());

        Serie lost = new Serie("Lost", 2000);
        movie.setRating(8);
        movie.setRating(5);
        movie.setRating(4);
        lost.setSeasons(10);
        lost.setEpisodesBySeason(10);
        lost.setMinutesByEp(50);
        System.out.println("Duração da serie: " + lost.getDurationInMinutes());

        CalculateTime cal = new CalculateTime();
        cal.include(movie);
        cal.include(movie2);
        cal.include(lost);
        System.out.println(cal.getTotalTime());

        FilterRecomendation filter = new FilterRecomendation();
        filter.filter(movie);
        filter.filter(movie2);

        Episode ep = new Episode(lost,1);
        ep.setTotalViews(200);

        System.out.println(ep.getName());
        filter.filter(ep);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(movie);
        listaDeFilmes.add(movie2);

        System.out.println("Tamanho da lista:" +listaDeFilmes.size());
        System.out.println("Primeiro Filme:" +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}