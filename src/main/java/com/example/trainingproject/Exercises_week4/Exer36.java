package com.example.trainingproject.Exercises_week4;


/*
Napisz program, który będzie symulował prosty dziennik elektroniczny. Program powinien umożliwiać:
a. Dodawanie ocen uczniów do dziennika (oceny w skali od 1 do 6, typ int) wraz z imieniem ucznia (typ String).
b. Wypisywanie średniej ocen dla danego ucznia. Program powinien pytać o imię ucznia i na tej podstawie obliczać średnią jego ocen.
c. Wypisywanie listy uczniów, którzy mają średnią ocen większą lub równą 4.5.
d. Możliwość usunięcia wszystkich ocen dla danego ucznia. Program powinien pytać o imię ucznia, a następnie usunąć wszystkie jego oceny z dziennika.


 */


import java.util.*;
import java.util.stream.Collectors;

public class Exer36 {

    private Map<String, List<Integer>> studentBook = new HashMap<>();

    public void addGrade(String name, int grade) {
        studentBook.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
    }

    public double averageGrade(String name) {
        List<Integer> grades = studentBook.get(name);
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public List<String> theBestStudents() {
        double goodGrade = 4.5;
        return studentBook.entrySet().stream()
                .filter(entry -> averageGrade(entry.getKey()) >= goodGrade)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public void deleteAllGradesForStudent(String studentName) {
        studentBook.remove(studentName);
    }
}
