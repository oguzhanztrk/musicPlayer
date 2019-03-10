package com.foo.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.*;



public class MainActivity extends AppCompatActivity {
  //  String pozi
  // syon;
int pozisyonGlobal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        ListView listView_Parcalar = (ListView)findViewById(R.id.listView_Parcalar);

        ArrayList<String> musicNames = new ArrayList<String>();
        musicNames.add("Emanetin Bende Saklı");
        musicNames.add("Yasak Aşk");
        musicNames.add("Jenerik Müziği");
        musicNames.add("Uçurumdun Sen");
        musicNames.add("Tüm İzlerini Sildim");
        musicNames.add("Aşka Teslim");
        musicNames.add("Konaktaki Yalnızlık");
        musicNames.add("Aşka Ağıt ");
        musicNames.add("Bir Günah Gibi - Ajda Pekkan & Toygar Işıklı");
        musicNames.add("Bihter ( İntihar )");
        musicNames.add("İmkansızdık ");
        musicNames.add("Çaresizlik Ölüm Gibi ");
        musicNames.add("Kalbimi Benden Alın");
        musicNames.add("Şikayetim Kendimden");
        musicNames.add("Bu Sır Elbet Çözülür");
        musicNames.add("Seni Beklemek ");
        musicNames.add("Beşir");
        musicNames.add("Sır");
        musicNames.add("Beni Ağlatmayın");
        musicNames.add("Sonu Belli Bir Hikaye");
        musicNames.add("Hatıran Bende Saklı");
        musicNames.add("Nihal");
        musicNames.add("Kum Saati Doluyor");
        musicNames.add("Bahar Yine Gelir mi");
        musicNames.add("Yıkık Hayaller ");
        musicNames.add("Yasak Aşk ( Remix by Uğur Kirik ) ");
        musicNames.add("Eskiden");
        musicNames.add("Hayalperest");
        musicNames.add("Söyleyemediklerim ( Matmazel )");
        musicNames.add("Küçük Umutlar ");
        musicNames.add("Yeni Güne Uyanış");

        // musicNames.add(pozisyon);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, musicNames);

        listView_Parcalar.setAdapter(arrayAdapter);

        listView_Parcalar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                pozisyonGlobal=position;
                Intent intent = new Intent(getApplicationContext(),PlayerActivity.class);
                intent.putExtra("pozisyonumuz" , Integer.toString(pozisyonGlobal));
                startActivity(intent);
            }
        });



    }
}