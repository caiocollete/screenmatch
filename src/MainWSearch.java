import com.caio.screenmatch.models.Title;
import com.caio.screenmatch.models.TitleOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWSearch {
    public static void main(String args[]) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        List<Title> titlesList = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        String busca = "";
        busca = scan.nextLine();

        while(!busca.equalsIgnoreCase("Sair")){
            String address = "https://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=f120dced";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                String json = response.body();

                // PROXIMO PASSO É TRATAR O JSON RECEBIDO DO REQUEST

                TitleOMDB buscaOMDB = gson.fromJson(json, TitleOMDB.class);


                Title myMovie = new Title(buscaOMDB);
                titlesList.add(myMovie);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            busca = scan.nextLine();
        }
        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titlesList));
        writer.close();
        System.out.println("End");
    }
}
