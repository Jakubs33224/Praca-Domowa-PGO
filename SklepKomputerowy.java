import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty;
    private ArrayList<Klient> klienci;
    private ArrayList<Zamowienie> zamowienia;

    public SklepKomputerowy() {
        produkty = new ArrayList<>();
        klienci = new ArrayList<>();
        zamowienia = new ArrayList<>();
    }


    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }


    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produkty);
        zamowienie.setIlosci(ilosci);
        zamowienie.setStatus("Nowe");
        zamowienie.setDataZamowienia("2025-04-04");
        zamowienia.add(zamowienie);
        return zamowienie;
    }


    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().length; i++) {
            Produkt produkt = zamowienie.getProdukty()[i];
            int ilosc = zamowienie.getIlosci()[i];
            produkt.setIloscWMagazynie(produkt.getIloscWMagazynie() - ilosc);
        }
    }


    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
                break;
            }
        }
    }


    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equalsIgnoreCase(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }


    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getKlient().getId() == idKlienta) {
                zamowienie.wyswietlSzczegoly();
            }
        }
    }
}

