package com.example.workers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 ImageView menu_btn,skip_btn;
 TextView tv_hp_title,tv_hp_subtitle;
 CardView cd_hp_first,cd_hp_second;
 LinearLayout layout;
    float v=0;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Welcome To Worker");
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"#3C92DF\">" + getString(R.string.app_name) + "</font>"));

//        menu_btn=findViewById(R.id.hp_menuBotton);
//        tv_hp_title=findViewById(R.id.hp_1st_cd_tv);
//        skip_btn=findViewById(R.id.hp_skip_icon);
//        tv_hp_subtitle=findViewById(R.id.tv_subtitile);
        cd_hp_first=findViewById(R.id.cd_hp_st);
        cd_hp_second=findViewById(R.id.cd_hp_1st);
//        layout=findViewById(R.id.layout_1);
        cd_hp_first.setElevation(0);
        cd_hp_second.setElevation(0);

//        menu_btn.setTranslationY(300);
//        tv_hp_title.setTranslationY(300);
//        skip_btn.setTranslationY(300);
//        tv_hp_subtitle.setTranslationY(300);
//
//        menu_btn.setAlpha(v);
//        tv_hp_title.setAlpha(v);
//        skip_btn.setAlpha(v);
//        tv_hp_subtitle.setAlpha(v);
//
//        menu_btn.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(200).start();
//        tv_hp_title.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
//        skip_btn.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        tv_hp_subtitle.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();
//
//
//        skip_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int f = (cd_hp_first.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
//                cd_hp_first.setTranslationY(400);
//                cd_hp_first.setAlpha(v);
//                cd_hp_first.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();
//                TransitionManager.beginDelayedTransition(layout, new AutoTransition());
//                cd_hp_first.setVisibility(View.GONE);
////                layout.setVisibility(View.GONE);
//            }
//        });

    }
}