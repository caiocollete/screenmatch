import com.caio.screenmatch.models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainWithLists {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("O poderoso chefão", 1970);
        meuFilme.setRating(9);

        Movie outroFilme = new Movie("Avatar", 2023);
        outroFilme.setRating(6);

        var filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.setRating(10);
        Serie lost = new Serie("Lost", 2000);

        Movie f1 = filmeDoPaulo;

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Title item: lista) {
            System.out.println(item.getName());
            if (item instanceof  Movie filme && filme.getClassification() > 2) {
                System.out.println("Classificação " + filme.getClassification());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getYear));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
