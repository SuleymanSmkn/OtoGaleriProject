package otogaleriprojesi;

import java.util.ArrayList;

public class Musteri {

    private String musteriAdi;
    private int musteriBakiye;
    ArrayList<Araba> userCars = new ArrayList<>();

    public Musteri(String musteriAdi, int musteriBakiye) {
        this.musteriAdi = musteriAdi;
        this.musteriBakiye = musteriBakiye;
    }

    public void arabaListesi() {
        System.out.println(getMusteriAdi() + " adlı kişinin mevcut araba listesi : \n"
                + userCars);
    }

    public void bakiyeSorgula() {
        System.out.println(getMusteriAdi() + " adlı müşterinin güncel bakiyesi : " + getMusteriBakiye() + " TL");
    }

    public void arabaSatinAl(Araba araba) {
        if (this.musteriBakiye >= araba.arabaFiyati) {
            userCars.add(araba);
            this.musteriBakiye -= araba.arabaFiyati;
            OtoGaleri.kayitliArabalar.remove(araba);
            System.out.println(musteriAdi + "Adlı kişi " + araba.arabaMarkasi + " markalı arabayı " + araba.arabaFiyati
                    + "Tl'ye satın aldı.");

        } else {
            System.out.println("Yetersiz Bakiye");
        }
    }

    public void musteriyeAitArabaSayisi() {
        System.out.println(userCars.size());
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    @Override
    public String toString() {
        return "musteriAdi : " + musteriAdi + "  musteriBakiye : " + musteriBakiye + "\n";
    }

    public int getMusteriBakiye() {
        return musteriBakiye;
    }

    public void setMusteriBakiye(int musteriBakiye) {
        this.musteriBakiye = musteriBakiye;
    }

}
