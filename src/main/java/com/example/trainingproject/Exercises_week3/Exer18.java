package com.example.trainingproject.Exercises_week3;

import java.util.Arrays;
import java.util.List;

class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
    double wynagrodzenie;

    Pracownik(String imie, String nazwisko, int wiek, double wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Wiek: %d, Wynagrodzenie: %.2f", imie, nazwisko, wiek, wynagrodzenie);
    }

}

public class Exer18 {

    public static void main(String[] args) {

        List<Pracownik> pracownicy = Arrays.asList(
                new Pracownik("Jan", "Kowalski", 45, 4000.0),
                new Pracownik("Anna", "Nowak", 30, 5000.0),
                new Pracownik("Paweł", "Wojcik", 25, 4500.0),
                new Pracownik("Katarzyna", "Kozłowska", 42, 8000.0),
                new Pracownik("Michał", "Zając", 36, 6200.0)
        );


        pracownicy.stream()
                .filter(pracownik -> pracownik.wiek > 40)
                .map(pracownik -> new Pracownik(pracownik.imie, pracownik.nazwisko, pracownik.wiek, pracownik.wynagrodzenie * 1.1))
                .forEach(System.out::println);
    }
}
