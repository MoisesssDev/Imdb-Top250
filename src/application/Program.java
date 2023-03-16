package application;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import entities.Filme;
import entities.ListaFilmes;



//import entities.Filme;

public class Program {

	public static void main(String[] args){
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_gevs7ryi")).GET().build();

		String body = null;

		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());

			body = response.body();

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//Desserialização do JSON
		Gson gson = new Gson();
		ListaFilmes listaFilmes = gson.fromJson(body, ListaFilmes.class);
		
		for (Filme filme : listaFilmes.getItems()) {
			System.out.println("Rank: " + filme.getRank());
			System.out.println("Título: " + filme.getTitle());
			System.out.println("Imagem: " + filme.getImage());
			System.out.println("Avaliação: " + filme.getImDbRating());
			System.out.println("Ano: " + filme.getYear());
			System.out.println();
		}
		
		

	}

}
