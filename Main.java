public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();


        Produkt produkt1 = new Produkt();
        produkt1.setId(1);
        produkt1.setNazwa("Laptop Dell XPS 13");
        produkt1.setKategoria("Laptop");
        produkt1.setCena(4999.99);
        produkt1.setIloscWMagazynie(10);

        Produkt produkt2 = new Produkt();
        produkt2.setId(2);
        produkt2.setNazwa("Mysz Logitech MX Master 3");
        produkt2.setKategoria("Mysz");
        produkt2.setCena(349.99);
        produkt2.setIloscWMagazynie(30);

        Produkt produkt3 = new Produkt();
        produkt3.setId(3);
        produkt3.setNazwa("Monitor Samsung 27\"");
        produkt3.setKategoria("Monitor");
        produkt3.setCena(1299.99);
        produkt3.setIloscWMagazynie(15);

        sklep.dodajProdukt(produkt1);
        sklep.dodajProdukt(produkt2);
        sklep.dodajProdukt(produkt3);


        Klient klient1 = new Klient();
        klient1.setId(1);
        klient1.setImie("Jan");
        klient1.setNazwisko("Kowalski");
        klient1.setEmail("jan.kowalski@example.com");
        klient1.setCzyStaly(true);

        Klient klient2 = new Klient();
        klient2.setId(2);
        klient2.setImie("Anna");
        klient2.setNazwisko("Nowak");
        klient2.setEmail("anna.nowak@example.com");
        klient2.setCzyStaly(false);

        sklep.dodajKlienta(klient1);
        sklep.dodajKlienta(klient2);


        Produkt[] produktyZamowienia1 = {produkt1, produkt2};
        int[] ilosciZamowienia1 = {1, 1};
        Zamowienie zamowienie1 = sklep.utworzZamowienie(klient1, produktyZamowienia1, ilosciZamowienia1);
        zamowienie1.zastosujZnizke();
        sklep.aktualizujStanMagazynowy(zamowienie1);
        zamowienie1.wyswietlSzczegoly();


        sklep.zmienStatusZamowienia(zamowienie1.getId(), "Zrealizowane");
        zamowienie1.wyswietlSzczegoly();


        sklep.wyswietlZamowieniaKlienta(1);
    }
}