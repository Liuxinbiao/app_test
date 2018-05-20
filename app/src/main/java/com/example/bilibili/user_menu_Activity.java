package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user_menu_Activity extends AppCompatActivity {
    private Button user_xiaoxi,user_guanzhu,user_shoucang;
    private Button user_guide,user_trip_mate,user_evaluate;
    private Button user_setting;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu_);
        user_xiaoxi=findViewById(R.id.person_data_xiaoxi);
        user_xiaoxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的消息界面
                Intent intent=new Intent(user_menu_Activity.this,User_xiaoxiActivity.class);
                startActivity(intent);

            }
        });
        user_guanzhu=findViewById(R.id.me_guanzhu);
        user_guanzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的关注界面
                Intent intent=new Intent(user_menu_Activity.this,User_guanzhu_Activity.class);
                startActivity(intent);

            }
        });
        user_shoucang=findViewById(R.id.me_shoucang);
        user_shoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的收藏界面
                Intent intent=new Intent(user_menu_Activity.this,user_shoucang_Activity.class);
                startActivity(intent);

            }
        });
        user_guide=findViewById(R.id.me_daoyou);
        user_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的导游界面
                Intent intent=new Intent(user_menu_Activity.this,user_guide_Activity.class);
                startActivity(intent);

            }
        });
        user_trip_mate=findViewById(R.id.me__trip_mate);
        user_trip_mate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的旅游界面
                Intent intent=new Intent(user_menu_Activity.this,trip_mate_Activity.class);
                startActivity(intent);

            }
        });
        user_evaluate=findViewById(R.id.me_review);
        user_evaluate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的评论界面
                Intent intent=new Intent(user_menu_Activity.this,user_evaluate_Activity.class);
                startActivity(intent);

            }
        });
        user_setting=findViewById(R.id.me_setting);
        user_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"我"界面下面的设置界面
                Intent intent=new Intent(user_menu_Activity.this,user_settingActivity.class);
                startActivity(intent);

            }
        });



    }
}
