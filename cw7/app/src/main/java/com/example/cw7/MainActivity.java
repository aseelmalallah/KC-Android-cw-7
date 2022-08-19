package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> dishes   = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Name , Price;
        ImageView DImage;

        Items D1 = new Items("Miso Soup", R.drawable.misosoup, 1.440);
        Items D2 = new Items("Shrimp Siomai", R.drawable.shrimpsiomai, 3.375);
        Items D5 = new Items("Nasu Miso", R.drawable.nasumiso, 3.300);
        Items D3 = new Items("Yasai Tempura", R.drawable.yasaitempura, 3.300);
        Items D4 = new Items("Yaki Saba",R.drawable.yakisaba , 4.500);
        Items D6 = new Items("Kimchi",R.drawable.kimchi , 1.800);

        dishes.add(D1);
        dishes.add(D2);
        dishes.add(D3);
        dishes.add(D4);
        dishes.add(D5);
        dishes.add(D6);

        ItemAdapter ItemAdapter = new ItemAdapter(this, 0, dishes);

        ListView ListView = findViewById(R.id.LV);
        ListView.setAdapter(ItemAdapter);









    }
}