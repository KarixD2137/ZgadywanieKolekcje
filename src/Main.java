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
    }
}