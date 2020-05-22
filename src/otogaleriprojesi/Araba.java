package otogaleriprojesi;

public class Araba {

    String arabaMarkasi;
    int arabaFiyati;
    int arabaModeli;

    public String getArabaMarkasi() {
        return arabaMarkasi;
    }

    public void setArabaMarkasi(String arabaMarkasi) {
        this.arabaMarkasi = arabaMarkasi;
    }

    @Override
    public String toString() {
        return "arabaMarkasi : " + arabaMarkasi + "- arabaFiyati : " + arabaFiyati + "- arabaModeli : " + arabaModeli + "\n";
    }

    public int getArabaFiyati() {
        return arabaFiyati;
    }

    public void setArabaFiyati(int arabaFiyati) {
        this.arabaFiyati = arabaFiyati;
    }

    public int getArabaModeli() {
        return arabaModeli;
    }

    public void setArabaModeli(int arabaModeli) {
        this.arabaModeli = arabaModeli;
    }

    public Araba(String arabaMarkasi, int arabaFiyati, int arabaModeli) {
        this.arabaMarkasi = arabaMarkasi;
        this.arabaFiyati = arabaFiyati;
        this.arabaModeli = arabaModeli;
    }

}
