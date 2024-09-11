import java.util.*;

public class Main {

    /**
     * wylosujListę - losuje listę liczb całkowich z zakresu 1,100
     * @param ileElementow liczba wylosowanych elementów
     * @return ArrayListę z liczbami wylosowanymi
     */
    // LOSOWANIE DO LISTY
    private static ArrayList<Integer> wylosujListe(int ileElementow)
    {
        ArrayList<Integer> ListaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ileElementow; i++) {
            int liczba = (int)(Math.random()*10+1);
            while(ListaLiczbWylosowanychBezPowtorzen.contains(liczba))
            {
                liczba = (int)(Math.random()*10+1);
            }
            ListaLiczbWylosowanychBezPowtorzen.add(liczba);
        }
        return ListaLiczbWylosowanychBezPowtorzen;
    }


    /**
     * wypiszListe - wypisuje wszystkie elementy listy
     * @param listaDoWypisania lista z liczbami do wypisania
     */
    // WYPISZ LISTĘ
    private static void wypiszListe(List<Integer> listaDoWypisania) {
        System.out.println("Wprowadzona tablica");
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.println(listaDoWypisania.get(i));
        }
    }

    /**
     * wstawLiczbyDoListy - wstawia do listy liczby wpisane z klawiatury
     * @param ileElementow określa ilośc elementów
     * @return listę z elementami wylosowanymi z klawiatury
     */
    // PRZYGOTOWUJE LISTĘ Z LICZBAMI WPISANYMI Z KLAWIATURY
    private static ArrayList<Integer> wstawLiczbyDoListy(int ileElementow){
        ArrayList<Integer> ListaLiczbZKlawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + ileElementow + " liczb");
        for (int i = 0; i < ileElementow; i++) {
            int liczba = klawiatura.nextInt();
            ListaLiczbZKlawiatury.add(liczba); // Dodawanie elementu do listy
        }
        return ListaLiczbZKlawiatury;
    }

    /**
     * zwrocElemtyZObuList - Znajduje część wspólną dwóch zbiorów i ją wypisuje
     * @param lista1
     * @param lista2
     * @return powatrzające się elementy
     */
    // TRAFIONE
    private static LinkedList<Integer> zwrocElemtyZObuList(ArrayList<Integer> lista1, ArrayList<Integer> lista2)
    {
        LinkedList<Integer> trafione = new LinkedList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if(lista2.contains(lista1.get(i)))
            {
                trafione.add(lista1.get(i));
            }
        }
        return trafione;
    }

    public static void main(String[] args) {
        ArrayList<Integer> liczbyWylosowane = wylosujListe(6);
        ArrayList<Integer> liczbyKlawiatura = wstawLiczbyDoListy(6);

        wypiszListe(liczbyWylosowane);
        wypiszListe(liczbyKlawiatura);
        LinkedList<Integer> trafioneLiczby = zwrocElemtyZObuList(liczbyWylosowane,liczbyKlawiatura);

        System.out.println(trafioneLiczby);
    }
}