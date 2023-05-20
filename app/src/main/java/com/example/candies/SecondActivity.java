package com.example.candies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Candy> candies=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_candies);
        CandyAdapter adapter = new CandyAdapter(this, candies);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        candies.add(new Candy("TWIX","1967","10/10",R.drawable.img_1));
        candies.add(new Candy("SNICKERS","1941","8/10",R.drawable.img_2));
        candies.add(new Candy("MARS","1932","4/10",R.drawable.img_3));
        candies.add(new Candy("KITKAT","1935","9/10",R.drawable.img_4));
    }
}