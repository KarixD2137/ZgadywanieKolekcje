import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private static ArrayList<Integer> wylosowane = new ArrayList<>();
    private ArrayList<Integer> wpisane = new ArrayList<>();
    private LinkedList<Integer> trafione = new LinkedList<>();

    private void wylosujLiczby(int ile){
        while (wylosowane.size() < ile) {
            int liczba = (int)(Math.random()*10+1);
            while(wylosowane.contains(liczba))
            {
                liczba = (int)(Math.random()*10+1);
            }
            wylosowane.add(liczba);
        }
    }

    private void wpiszZKlawiatury(int ile){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + ile + " liczb");
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba); // Dodawanie elementu do listy
        }
    }

    private void wypiszKolekcje(List<Integer> lista)
    {
        System.out.println("Wypisana lista:");
        {
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i) + ", ");
            }
        }
    }

    private void sprawdz()
    {
        for (int i = 0; i < wylosowane.size(); i++) {
            if(wpisane.contains(wylosowane.get(i)))
            {
                trafione.add(wpisane.get(i));
            }
        }
    }

    public void zagraj(){
        wylosujLiczby(6);
        wpiszZKlawiatury(6);
        sprawdz();
        System.out.println("");
        System.out.println("Wylosowane");
        wypiszKolekcje(wylosowane);
        System.out.println("");
        System.out.println("Wpisane");
        wypiszKolekcje(wpisane);
        System.out.println("");
        System.out.println("Trafione");
        wypiszKolekcje(trafione);
    }
}
