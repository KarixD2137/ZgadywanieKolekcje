import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Losowanie liczb do tablicy 6 - elementowej

        /*
        Tablica misi mieć zdefiniowany rozmiar, którego potem nie można zmieniać.
        W Javie tablica może przechowywać typy proste i złożone.
        */

        int[] tablicaLiczbLosowych = new int[6];
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int) (Math.random()*100+1); // losowanie od 1 do 100
        }

        // Wypisywanie tablicy na ekranie
        System.out.println("Wylosowana tablica: ");

        // for(typ nazwa:nazwa_kolekcji)
        for (int element:tablicaLiczbLosowych)
        {
            System.out.print(element+", ");
            // System.out.print(); - wypisywanie linii nie zakończonej enterem
            // System.out.println(); - wypisywanie linii zakończonej enterem
        }

        // Kolekcje
        /*
        Kolekcje mogą mieć zmieniany rozmir (dodawanie i usuwanie elementów)
        Kolekcje jako typy złożone (z dużej litery)
        Rodzaje kolekcji:
        - listy   List - interfejs, ArrayList LinkedList
        - zbiory  Set - interfejs, HashSet
        - mapy
        */

        // Przygotuj listę z liczbami wpisanymi z klawiatury
        ArrayList<Integer> ListaLiczbZKlawiatury = new ArrayList<>();
        // alt + Enter - importuje klasę

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            ListaLiczbZKlawiatury.add(liczba); // Dodawanie elementu do listy
        }

        // Wypisz listę
        System.out.println("Wprowadzona tablica");
        for (int i = 0; i < ListaLiczbZKlawiatury.size(); i++)
        {
            System.out.println(ListaLiczbZKlawiatury.get(i));
        }
        System.out.println("");
        System.out.println(ListaLiczbZKlawiatury);
    }
}