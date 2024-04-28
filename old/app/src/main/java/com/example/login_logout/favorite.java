package com.example.login_logout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class favorite extends AppCompatActivity {
    private ImageView city, sky, uhouse, tooldorm, toolfav, tooluser ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorite);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tooldorm = findViewById(R.id.tooldorm);
        tooldorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this, dorm.class);
                startActivity(intent);
            }
        });

        toolfav = findViewById(R.id.toolfav);
        toolfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this, favorite.class);
                startActivity(intent);
            }
        });

        tooluser = findViewById(R.id.tooluser);
        tooluser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this, user.class);
                startActivity(intent);
            }
        });

        city = findViewById(R.id.city);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this, city.class);
                startActivity(intent);
            }
        });

        sky = findViewById(R.id.sky);
        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this, sky.class);
                startActivity(intent);
            }
        });

        uhouse = findViewById(R.id.uhouse);
        uhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this, uhouse.class);
                startActivity(intent);
            }
        });
    }
}