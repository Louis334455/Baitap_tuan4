package com.example.baitap_tuan4;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4_2_firstactivity extends AppCompatActivity {
    Button quizbut;
    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.bai4_2_firstactivity);
        quizbut =  findViewById(R.id.buttonquiz);
        quizbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(Bai4_2_firstactivity.this, com.example.baitap_tuan4.Bai4_2_secondactivity.class);
                startActivity(myintent);
            }
        });
    }
}
