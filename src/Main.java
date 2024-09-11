import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // LOSOWANIE LICZB DO TABLICY 6 - ELEMENTOWEJ

        /*
        Tablica misi mieć zdefiniowany rozmiar, którego potem nie można zmieniać.
        W Javie tablica może przechowywać typy proste i złożone.
        */

        int[] tablicaLiczbLosowych = new int[6];
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int) (Math.random()*10+1); // losowanie od 1 do 100
        }

        // WYPISYWANIE TABLICY NA EKRANIE
        System.out.println("Wylosowana tablica: ");

        // for(typ nazwa:nazwa_kolekcji)
        for (int element:tablicaLiczbLosowych)
        {
            System.out.print(element+", ");
            // System.out.print(); - wypisywanie linii nie zakończonej enterem
            // System.out.println(); - wypisywanie linii zakończonej enterem
        }

        // KOLEKCJE
        /*
        Kolekcje mogą mieć zmieniany rozmir (dodawanie i usuwanie elementów)
        Kolekcje jako typy złożone (z dużej litery)
        Rodzaje kolekcji:
        - listy   List - interfejs, ArrayList LinkedList
        - zbiory  Set - interfejs, HashSet
        - mapy
        */

        // PRZYGOTUJ LISTĘ Z LICZBAMI WPISANYMI Z KLAWIATURY
        ArrayList<Integer> ListaLiczbZKlawiatury = new ArrayList<>();
        // alt + Enter - importuje klasę

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            ListaLiczbZKlawiatury.add(liczba); // Dodawanie elementu do listy
        }

        // WYPISZ LISTĘ
        System.out.println("Wprowadzona tablica");
        for (int i = 0; i < ListaLiczbZKlawiatury.size(); i++)
        {
            System.out.println(ListaLiczbZKlawiatury.get(i));
        }
        System.out.println("");
        System.out.println(ListaLiczbZKlawiatury);

        // LOSOWANIE LISTY BEZ POWTÓRZEŃ
        ArrayList<Integer> ListaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*10+1);
            while(ListaLiczbWylosowanychBezPowtorzen.contains(liczba))
            {
                liczba = (int)(Math.random()*10+1);
            }
            ListaLiczbWylosowanychBezPowtorzen.add(liczba);
        }
        System.out.println("");
        System.out.println("Lista bez powtórzeń");
        System.out.println(ListaLiczbWylosowanychBezPowtorzen);

        // LOSOWANIE DO ZBIORU
        HashSet<Integer> zbiorLosowychBezPowtorzen = new HashSet<>();
        while (zbiorLosowychBezPowtorzen.size()<6)
        {
            int liczba = (int)(Math.random()*100+1);
            zbiorLosowychBezPowtorzen.add(liczba);
        }
        System.out.println("");
        System.out.println("Zbiór losowych bez powtórzeń");
        System.out.println(zbiorLosowychBezPowtorzen);

        /*
        Listy
        uporządkowane, indeksowane. mogą powtarzać warości

        Zbiory
        zazwyczaj nieuporządkowane, nieindeksowane, bez powtózeń

         */

        // TRAFIONE

        LinkedList<Integer> trafione = new LinkedList<>();
        for (int i = 0; i < ListaLiczbZKlawiatury.size(); i++) {
            if(ListaLiczbWylosowanychBezPowtorzen.contains(ListaLiczbZKlawiatury.get(i)))
            {
                trafione.add(ListaLiczbZKlawiatury.get(i));
            }
        }
        System.out.println("");
        System.out.println("Trafione");
        System.out.println(trafione);

    }
}