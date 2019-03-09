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
        musicNames.add("Jenerik Müziği");
        musicNames.add("parca2");
        musicNames.add("parca3");
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