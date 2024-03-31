package com.example.trainingproject.Exercises_week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Napisz program, który będzie symulował prosty system zarządzania biblioteką. Program powinien umożliwiać:
a. Dodawanie książek do systemu (każda książka powinna mieć tytuł, autora i rok wydania, typy odpowiednio: String, String, int).
b. Wypożyczanie książek. Program powinien pytać o tytuł książki i na tej podstawie zmieniać status książki na "wypożyczona".
eśli książka jest już wypożyczona, wyświetlić komunikat "Książka niedostępna".
c. Zwracanie książek. Program po wprowadzeniu tytułu książki powinien zmienić status książki na "dostępna".
d. Wypisywanie wszystkich dostępnych książek w bibliotece.

Program powinien korzystać z kolekcji typu Map, gdzie kluczem jest tytuł książki,
a wartością obiekt klasy Book zawierający autora, rok wydania i status dostępności.
Użyj odpowiednich struktur danych i algorytmów do zarządzania danymi i ich przetwarzania.
Po uruchomieniu, program powinien oferować menu z opcjami do wyboru odpowiadającymi powyższym funkcjonalnościom,
 a użytkownik powinien móc nawigować po menu, korzystając z konsoli.


 */


public class Exer38 {

    private Map<String, Book> library = new HashMap<>();

    public void addBookToLibrary(String title, String author, int yearOfPublication) {
        Book book = new Book(title, author, yearOfPublication);
        library.put(title, book);
    }

    public void borrowBook(String title) {
        Book book = library.get(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Książka \"" + title + "\" została wypożyczona.");
        } else {
            System.out.println("Książka niedostępna.");
        }
    }

    public void returnBook(String title) {
        Book book = library.get(title);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Książka \"" + title + "\" została zwrócona.");
        } else {
            System.out.println("Taka książka nie istnieje lub jest już dostępna.");
        }
    }

    public void listAvailableBooks() {
        System.out.println("Dostępne książki:");
        library.values().stream()
                .filter(Book::isAvailable)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Exer38 librarySystem = new Exer38();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("\n1. Dodaj książkę\n2. Wypożycz książkę\n3. Zwróć książkę\n4. Pokaż dostępne książki\n5. Wyjdź");
            System.out.print("Wybierz opcję: ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    System.out.print("Podaj tytuł: ");
                    String title = scanner.nextLine();
                    System.out.print("Podaj autora: ");
                    String author = scanner.nextLine();
                    System.out.print("Podaj rok wydania: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    librarySystem.addBookToLibrary(title, author, year);
                    System.out.println("Dodano książkę.");
                    break;
                case "2":
                    System.out.print("Podaj tytuł książki do wypożyczenia: ");
                    title = scanner.nextLine();
                    librarySystem.borrowBook(title);
                    break;
                case "3":
                    System.out.print("Podaj tytuł książki do zwrotu: ");
                    title = scanner.nextLine();
                    librarySystem.returnBook(title);
                    break;
                case "4":
                    librarySystem.listAvailableBooks();
                    break;
                case "5":
                    System.out.println("Zakończenie programu.");
                    break;
                default:
                    System.out.println("Nieznana opcja, spróbuj ponownie.");
            }
        } while (!userInput.equals("5"));
    }
}