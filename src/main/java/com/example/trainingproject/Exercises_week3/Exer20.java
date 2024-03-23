package com.example.trainingproject.Exercises_week3;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
class Produkt {
    String kodProduktu;
    String nazwa;
    String kategoria;
    double cena;
    int ilosc;

    public Produkt(String kodProduktu, String nazwa, String kategoria, double cena, int ilosc) {
        this.kodProduktu = kodProduktu;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
        this.ilosc = ilosc;
    }

}
    public class Exer20 {

        public static void main(String[] args) {
            List<Produkt> produkty = Arrays.asList(
                    new Produkt("P001", "Laptop Gamingowy", "Elektronika", 4500.0, 7),
                    new Produkt("P002", "Smartfon Pro", "Elektronika", 3200.0, 15),
                    new Produkt("P003", "Słuchawki Bezprzewodowe", "Elektronika", 600.0, 25),
                    new Produkt("P004", "E-book Reader", "Elektronika", 750.0, 8),
                    new Produkt("P005", "Mikser Kuchenny", "Dom", 450.0, 12),
                    new Produkt("P006", "Robot Sprzątający", "Dom", 1400.0, 5),
                    new Produkt("P007", "Odkurzacz Bezprzewodowy", "Dom", 1200.0, 10),
                    new Produkt("P008", "Kosiarka Elektryczna", "Ogród", 800.0, 7),
                    new Produkt("P009", "Grill Gazowy", "Ogród", 1500.0, 3),
                    new Produkt("P010", "Ławka Ogrodowa", "Ogród", 300.0, 15),
                    new Produkt("P011", "Lampa Stołowa", "Dom", 220.0, 20),
                    new Produkt("P012", "Fotel Biurowy", "Dom", 550.0, 10),
                    new Produkt("P013", "Zestaw Narzędzi", "Ogród", 250.0, 30),
                    new Produkt("P014", "Telewizor 55 cali", "Elektronika", 2800.0, 4),
                    new Produkt("P015", "Głośnik Bluetooth", "Elektronika", 150.0, 50));



            List<Produkt> elektronikaPowyzej1000 = produkty.stream()
                    .filter(produkt -> produkt.kategoria.equals("Elektronika") && produkt.cena < 1000)
                    .collect(Collectors.toList());

            double averageHomePrices = produkty.stream()
                    .filter(produkt -> "Dom".equals(produkt.getKategoria()))
                    .mapToDouble(Produkt::getCena)
                    .average()
                    .orElse(0.0);




    }}
