package otogaleriprojesi;

import java.util.ArrayList;

public class OtoGaleri {

    static ArrayList<Musteri> kayitliMusteriler = new ArrayList<>();
    static ArrayList<Araba> kayitliArabalar = new ArrayList<>();
    int galeriBakiye;

    public OtoGaleri(int galeriBakiye) {
        this.galeriBakiye = galeriBakiye;

    }

    public void arabaEkle(Araba yeniAraba) {
        if (!kayitliArabalar.contains(yeniAraba)) {
            kayitliArabalar.add(yeniAraba);
        } else {
            System.out.println("bu arac zaten kayıtlı");
        }
    }

    public void arabaCikar(Araba cikarilacakAraba) {
        if (kayitliArabalar.contains(cikarilacakAraba)) {
            kayitliArabalar.remove(cikarilacakAraba);
        } else {
            System.out.println("bu arac zaten galeride mevcut değil");
        }
    }

    public void musteriEkle(Musteri yeniMusteri) {
        if (!kayitliMusteriler.contains(yeniMusteri)) {
            kayitliMusteriler.add(yeniMusteri);
        } else {
            System.out.println("bu musteri zaten kayıtlı");
        }
    }

    public void musteriCikar(Musteri cikarilacakMusteri) {
        if (kayitliMusteriler.contains(cikarilacakMusteri)) {
            kayitliMusteriler.remove(cikarilacakMusteri);

        } else {
            System.out.println("bu musteri zaten kayıtlı değil");
        }
    }

    public void musteriListesi() {
        System.out.println(kayitliMusteriler);
    }

    public void arabaListesi() {
        System.out.println("Otogaleride mevcut olan arabalar : ");
        System.out.println(kayitliArabalar);
    }

    public void arabaSat(Musteri musteri, Araba araba) {
        if (musteri.getMusteriBakiye() > araba.arabaFiyati) {
            System.out.println(musteri.getMusteriAdi() + " adlı müşteriye  " + araba.getArabaMarkasi()
                    + araba.getArabaFiyati() + " Tl fiyatındaki " + araba.getArabaMarkasi() + " markalı araba satılmıştır.");
            musteri.setMusteriBakiye(musteri.getMusteriBakiye() - araba.arabaFiyati);

            kayitliArabalar.remove(araba);
            musteri.userCars.add(araba);

        } else {
            System.out.println("Müşteri bakiyesi yetersiz olduğu için bu aracı satın alamaz.");
        }
    }

    public void arabaSatinAl(Musteri musteri, Araba araba) {
        if (musteri.userCars.contains(araba) && galeriBakiye > araba.getArabaFiyati()) {

            musteri.userCars.remove(araba);
            arabaEkle(araba);
            musteri.setMusteriBakiye(musteri.getMusteriBakiye() + araba.arabaFiyati);
            //musterinin bakiyesini arabanın fiyatı kadar arttırdık
            galeriBakiye -= araba.arabaFiyati;
            System.out.println(musteri.getMusteriAdi() + " adlı musteriden  " + araba.getArabaMarkasi() + " markalı araba"
                    + araba.arabaFiyati + "'Tlye satın alınmıştır.");

        } else {
            System.out.println("Yetersiz bakiye");
        }
    }

    public void arabaKirala(Musteri musteri, Araba araba, int gunluk) {
        if (kayitliArabalar.contains(araba)) {
            musteri.userCars.add(araba);
            int kiralamaBedeli = (araba.arabaFiyati / (365 / gunluk));
            musteri.setMusteriBakiye(musteri.getMusteriBakiye() - kiralamaBedeli);
            galeriBakiye += kiralamaBedeli;
            System.out.println(araba.arabaMarkasi + " markalı araç " + musteri.getMusteriAdi() + " adlı kişiye "
                    + kiralamaBedeli + " TL fiyata kiralanmıştır");
        } else {
            System.out.println("Yetersiz bakiye");
        }
    }

    public void arabayiKiracidanGeriAl(Musteri musteri, Araba araba) {
        musteri.userCars.remove(araba);
        System.out.println("Kiralanan araç  " + musteri.getMusteriAdi() + " adlı kişiden geri alınmıştır.");
    }

}
