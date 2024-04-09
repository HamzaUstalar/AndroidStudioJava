package com.adisyonis.genel_ders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ayakkabi ayakkabi1=new Ayakkabi("Adidas","Spor","Mavi",47.5,"Erkek");
        System.out.println(ayakkabi1.getCinsiyet());
        ayakkabi1.setCinsiyet("Kadın"); // Burada cinsiyeti değiştirdik.
        System.out.println(ayakkabi1.getCinsiyet());
        // Listemizi buradan açıyoruz.
        ArrayList<String> liste =new ArrayList<>();
        // Listemizi dolduralım.
        liste.add("Elma");
        liste.add("Armut");
        liste.add("Muz");
        // Liste elemanlarını ekrana yazdırma :
        System.out.println("Listenin içindeki elemanlar => ");
        for (String eleman : liste){ // Burada listenin içindeki stringleri eleman adlı değişkene eşitledim.
            System.out.println(eleman); // For döngüsü ile eşitlenen her string değişkeni ekrana yazdırdım.
        }
        int listeBoyutu = liste.size(); // Listemizin boyunu listeBoyutu adlı değişkene atadık ve ekrana yazdırdık.
        System.out.println("Listenin boyutu : " + listeBoyutu);
        // Belirli bir indeksteki elemana erişme
        String indeksEleman = liste.get(2);
        System.out.println("2.İndeksteki eleman = "+indeksEleman);

        // Listenin içinde var olup olmadığını kontrol etme
        // liste.contains("x") şeklinde içinde olup olmadığına bakılır.
        // contains = içerir anlamı taşır.
        if(liste.contains("Armut")){
            System.out.println("Armut Listemizde Bulunmaktadır.");
        }
        else{
            System.out.println("Armut Listede Maalesef Yoktur.");
        }
        // Listedeki belirli bir elemanı listeden çıkarma işlemi
        liste.remove("Armut");
        System.out.println("Listeden çıktıktan sonraki hali : ");
        for(String eleman : liste){
            System.out.println(eleman);
        }
        // Listede Armut var ise
        if (liste.contains("Armut")){
            System.out.println("Armut hala listede vardır.");
        }
        else{
            System.out.println("Armut Listede Yoktur."); // Listede varlığı olmadığı için burada çalıştı.
        }

        liste.clear(); // Listeyi tamamen siler.
        System.out.println("Liste Temizlendikten Sonra Listeminizdeki Eleman Sayısı : "+ liste.size());

    }

}