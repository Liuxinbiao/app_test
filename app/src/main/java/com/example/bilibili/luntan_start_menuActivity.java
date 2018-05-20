package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class luntan_start_menuActivity extends AppCompatActivity {
    private TextView beijing,dali,hangzhou,mangu,shanghai,tangshan,tianjin,chengdu;
    private Button luntan_me,luntan_luntan,luntan_shouye,luntan_faxian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luntan_strt_menu);
        beijing=findViewById(R.id.luntan_beijing);
        beijing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_beijing_Activity.class);
                startActivity(intent);

            }
        });
        dali=findViewById(R.id.luntan_dali);
        dali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到大理详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_dali_Activity.class);
                startActivity(intent);

            }
        });
        hangzhou=findViewById(R.id.luntan_hangzhou);
        hangzhou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到杭州详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_hangzhou_Activity.class);
                startActivity(intent);

            }
        });
        mangu=findViewById(R.id.luntan_taiguo);
        mangu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到曼谷详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_mangu_Activity.class);
                startActivity(intent);

            }
        });
        shanghai=findViewById(R.id.luntan_shanghai);
        shanghai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到上海详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_shanghai_Activity.class);
                startActivity(intent);

            }
        });
        tangshan=findViewById(R.id.luntan_tangshan);
        tangshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到唐山详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_tangshan_Activity.class);
                startActivity(intent);

            }
        });
        tianjin=findViewById(R.id.luntan_tianjin);
        tianjin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到天津详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_tianjin_Activity.class);
                startActivity(intent);

            }
        });
        chengdu=findViewById(R.id.luntan_yunnan);
        chengdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到成都详细景点
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_chengdu_Activity.class);
                startActivity(intent);

            }
        });
        luntan_me=findViewById(R.id.luntan_start_txt_user);
        luntan_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到论坛界面
                Intent intent=new Intent(luntan_start_menuActivity.this,luntan_start_menuActivity.class);
                startActivity(intent);

            }
        });
        luntan_luntan=findViewById(R.id.luntan_start_txt_more);
        luntan_luntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到”我“界面
                Intent intent=new Intent(luntan_start_menuActivity.this,user_menu_Activity.class);
                startActivity(intent);

            }
        });
          luntan_shouye=findViewById(R.id.luntan_start_txt_poi);
        luntan_shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到发现界面
//                Intent intent=new Intent(luntan_start_menuActivity.this,user_menu_Activity.class);
//                startActivity(intent);

            }
        });
          luntan_faxian=findViewById(R.id.luntan_start_txt_deal);
        luntan_faxian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到首页界面
                Intent intent=new Intent(luntan_start_menuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });




    }
}
