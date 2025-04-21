package com.example.baitap_tuan4;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitap_tuan4.R;

public class Bai4_2_secondactivity extends AppCompatActivity {
    Button playbutt;
    @Override
    protected void onCreate (Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.bai4_2_secondactivity);
        playbutt = findViewById(R.id.Playbut);
        playbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
