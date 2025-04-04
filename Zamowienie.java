public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosci[i];
        }
        return suma;
    }

    public void wyswietlSzczegoly() {
        System.out.println("ID Zamówienia: " + id + ", Klient: " + klient.getImie() + " " + klient.getNazwisko() + ", Data: " + dataZamowienia + ", Status: " + status);
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("Produkt: " + produkty[i].getNazwa() + ", Ilość: " + ilosci[i] + ", Cena: " + produkty[i].getCena() + ", Wartość: " + (produkty[i].getCena() * ilosci[i]));
        }
        System.out.println("Łączna wartość zamówienia: " + obliczWartoscZamowienia());
    }

    public void zastosujZnizke() {
        if (klient.isCzyStaly()) {
            System.out.println("Zastosowano zniżkę 10% dla stałego klienta.");
        }
    }
}