package com.example.login_logout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class dorm extends AppCompatActivity {
    private ImageView accom, campus, city, haus, jpark, sky, tudio, uhouse ;

    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dorm);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter;
        List<String> list;
        list = new ArrayList<String>();
        list.add("Area");
        list.add("Price");
        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        campus = findViewById(R.id.campus);
        campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, campus.class);
                startActivity(intent);
            }
        });

        accom = findViewById(R.id.accom);
        accom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, accom.class);
                startActivity(intent);
            }
        });

        city = findViewById(R.id.city);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, city.class);
                startActivity(intent);
            }
        });

        haus = findViewById(R.id.haus);
        haus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, haus.class);
                startActivity(intent);
            }
        });

        jpark = findViewById(R.id.jpark);
        jpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, jpark.class);
                startActivity(intent);
            }
        });

        sky = findViewById(R.id.sky);
        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, sky.class);
                startActivity(intent);
            }
        });

        tudio = findViewById(R.id.tudio);
        tudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, tudio.class);
                startActivity(intent);
            }
        });

        uhouse = findViewById(R.id.uhouse);
        uhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dorm.this, uhouse.class);
                startActivity(intent);
            }
        });
    }
}