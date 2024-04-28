package com.example.login_logout;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class city extends AppCompatActivity {

    private ImageView fav_btn;
    private boolean is_fav = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_city);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageView = (ImageView) findViewById(R.id.city_map);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://maps.app.goo.gl/jhwC1NYNvYm5kjv96");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        // link campus
        TextView facebook = findViewById(R.id.city_facebook);
        facebook.setMovementMethod(LinkMovementMethod.getInstance());
        facebook.setLinkTextColor(Color.BLACK);

        TextView web = findViewById(R.id.city_web);
        web.setMovementMethod(LinkMovementMethod.getInstance());
        web.setLinkTextColor(Color.BLACK);

        fav_btn = findViewById(R.id.fav_btn);
        fav_btn.setOnClickListener(view -> favorite());
    }

    private void favorite() {
        if (!is_fav) {
            fav_btn.setColorFilter(Color.RED);
            is_fav = true;
        } else {
            fav_btn.clearColorFilter();
            is_fav = false;
        }
    }
}