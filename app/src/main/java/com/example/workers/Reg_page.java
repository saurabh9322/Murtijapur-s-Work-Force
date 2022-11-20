package com.example.workers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Reg_page extends AppCompatActivity {

   TextView Tv_Reg_page_Card1_next_btn,Tv_Reg_page_Card2_next_btn;
   CardView reg_page_cd1,reg_page_cd2,reg_page_cd3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_page);
        getSupportActionBar().hide();


        startActivity(new Intent(getApplicationContext(),HomeNavigation.class));

        // Button
        Tv_Reg_page_Card1_next_btn=findViewById(R.id.tv_reg_page_cd1_nextbtn);
        Tv_Reg_page_Card2_next_btn=findViewById(R.id.tv_reg_page_cd2_nextbtn);

        // CardView
        reg_page_cd1=findViewById(R.id.reg_page_cd_1);
        reg_page_cd2=findViewById(R.id.reg_page_cd_2);
        reg_page_cd3=findViewById(R.id.reg_page_cd_3);


        Tv_Reg_page_Card1_next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reg_page_cd1.setVisibility(View.GONE);
                reg_page_cd2.setVisibility(View.VISIBLE);
            }
        });

        Tv_Reg_page_Card2_next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                reg_page_cd2.setVisibility(View.GONE);
                reg_page_cd3.setVisibility(View.VISIBLE);
            }
        });
    }
}