package com.example.aturuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[], s2[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.total);
        s2 = getResources().getStringArray(R.array.jumlah);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2);
        recylerView.setAdapter(myAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }


}