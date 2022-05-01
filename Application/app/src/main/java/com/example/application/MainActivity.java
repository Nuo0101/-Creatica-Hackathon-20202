package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayAdapter<String> listadptor;
    ArrayList<String> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String []brand = {"Apple","Google"};

        listview = findViewById(R.id.list);
        lists = new ArrayList<>();

        for(int i=0; i<brand.length; i++){
            lists.add(brand[i]);
        }

        listadptor = new ArrayAdapter<String>(this,lists.size(),lists);
        listview.setAdapter(listadptor);

        new Fragment().show(getSupportFragmentManager(), "ADD_CITY"); // display starter message

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.putExtra("brand", listadptor.getItem(i));
                // start intent activity
            }
        });

    }
}