package otogaleriprojesi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OtoGaleri otogaleri = new OtoGaleri(100000);
        Musteri ahmet = new Musteri("ahmet", 30000);
        Musteri ayse = new Musteri("ayse", 120000);
        Musteri fatma = new Musteri("fatma", 50000);
        Araba mercedes = new Araba("mercedes-benz", 20000, 2002);
        Araba bmvX3 = new Araba("bmv-x3", 30000, 2012);
        Araba audiA4 = new Araba("audi-A4", 40000, 2010);
        Araba audiRS = new Araba("audi-RS", 50000, 2014);

        otogaleri.arabaEkle(audiA4);
        otogaleri.arabaEkle(bmvX3);
        otogaleri.arabaEkle(mercedes);
        otogaleri.arabaEkle(audiRS);

        otogaleri.musteriEkle(ahmet);
        otogaleri.musteriEkle(ayse);
        otogaleri.arabaListesi();
        System.out.println("=============");
        ayse.bakiyeSorgula();
        ayse.arabaSatinAl(audiA4);
        System.out.println("*********");
        ayse.bakiyeSorgula();
        otogaleri.arabaSat(ayse, audiRS);
        System.out.println("****");
        ayse.bakiyeSorgula();
        ayse.arabaListesi();
        otogaleri.arabaListesi();
        System.out.println("********");
        ayse.arabaSatinAl(mercedes);
        System.out.println("****");
        ayse.arabaListesi();
        System.out.println("***");
        otogaleri.arabaListesi();
        System.out.println("===============");
        otogaleri.arabaSatinAl(ayse, audiA4);
        ayse.arabaListesi();
        ayse.bakiyeSorgula();
        System.out.println("=============");
        otogaleri.arabaKirala(ayse, audiA4, 10);
        ayse.bakiyeSorgula();
        System.out.println("=============");

    }

}
