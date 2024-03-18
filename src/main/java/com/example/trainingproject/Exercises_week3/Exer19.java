package com.example.trainingproject.Exercises_week3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Ksiazka {
    String tytul;
    String autor;
    int rokWydania;
    String kategoria;

    Ksiazka(String tytul, String autor, int rokWydania, String kategoria) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" autorstwa %s, %d (%s)", tytul, autor, rokWydania, kategoria);
    }
}

public class Exer19 {

    public static void main(String[] args) {
        List<Ksiazka> ksiazki = Arrays.asList(
                new Ksiazka("W pustyni i w puszczy", "Henryk Sienkiewicz", 1911, "Literatura piękna"),
                new Ksiazka("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", 1937, "Fantasy"),
                new Ksiazka("Krótka historia czasu", "Stephen Hawking", 1988, "Nauka"),
                new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1954, "Fantasy"),
                new Ksiazka("Ogniem i mieczem", "Henryk Sienkiewicz", 1884, "Literatura piękna"),
                new Ksiazka("Dzieje Tristana i Izoldy", "Józef Bédier", 1900, "Literatura piękna"),
                new Ksiazka("Sapiens. Od zwierząt do bogów", "Yuval Noah Harari", 2011, "Historia")
        );


        Map<String, List<Ksiazka>> pogrupowaneKsiazki = ksiazki.stream()
                .filter(ksiazka -> ksiazka.rokWydania > 1950)
                .collect(Collectors.groupingBy(ksiazka -> ksiazka.kategoria));

        pogrupowaneKsiazki.forEach((kategoria, listaKsiazek) -> {
            System.out.println(kategoria + ": ");
            listaKsiazek.forEach(ksiazka -> System.out.println(" - " + ksiazka));
            System.out.println(); // Dodaje pustą linię dla lepszej czytelności
        });
    }
}
