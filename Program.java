public class Program {
    public static void main(String[] args) {
        Bibliotekamuzyczna mojaBiblioteka = new Bibliotekamuzyczna("Kolekcja TOP", "Jakub Pawlak");

        mojaBiblioteka.dodajUtwor("Stressed Out - Twenty One Pilots");
        mojaBiblioteka.dodajUtwor("Nico and the Niners - Twenty One Pilots");
        mojaBiblioteka.dodajUtwor("THANK GOD - Travis Scott");
        mojaBiblioteka.dodajUtwor("Thunder - Imagine Dragons");
        mojaBiblioteka.dodajUtwor("Najnowszy Klip - Dawid Podsiadło");

        mojaBiblioteka.wyswietlUtwory();

        mojaBiblioteka.utworzPlayliste("Ulubione");
        mojaBiblioteka.utworzPlayliste("Na imprezę");

        mojaBiblioteka.dodajUtworDoPlaylisty("Stressed Out - Twenty One Pilots", "Ulubione");
        mojaBiblioteka.dodajUtworDoPlaylisty("Nico and the Niners - Twenty One Pilots", "Ulubione");
        mojaBiblioteka.dodajUtworDoPlaylisty("THANK GOD - Travis Scott", "Na imprezę");
        mojaBiblioteka.dodajUtworDoPlaylisty("Thunder - Imagine Dragons", "Na imprezę");
        mojaBiblioteka.dodajUtworDoPlaylisty("Najnowszy Klip - Dawid Podsiadło", "Na imprezę");

        mojaBiblioteka.wyswietlWszystkiePlaylisty();
        mojaBiblioteka.wyswietlPlayliste("Ulubione");
        mojaBiblioteka.wyszukajUtwory("Twenty One Pilots");

        mojaBiblioteka.usunUtwor("Najnowszy Klip - Dawid Podsiadło");
        mojaBiblioteka.wyswietlPlayliste("Na imprezę");

        System.out.println("Łączna liczba utworów w bibliotece: " + mojaBiblioteka.getLiczbaUtworow());
        System.out.println("Łączna liczba playlist: " + mojaBiblioteka.getLiczbaPlaylist());
    }
}
