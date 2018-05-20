package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class luntan_beijing_Activity extends AppCompatActivity {
    private TextView jingdian_beijing1,jingdian_beijing2,jingdian_nanluo,jingdian_nanluo1,beijing_tiantan,beijing_tiantan2,beijing_niaochao,beijing_niaochao1,beijing_yiheyuan,beijing_yiheyuan1;
    private Button guide,guide_rank,together_trip,QA_rank;
    private Button beijing_me,beijing_luntan,beijing_shouye,beijing_faxian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luntan_beijing_);
        jingdian_beijing1=findViewById(R.id.beijing_changcheng1);
        jingdian_beijing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点长城
                Intent intent=new Intent(luntan_beijing_Activity.this,beijing_view_detail_Activity.class);
                startActivity(intent);

            }
        });
        jingdian_beijing2=findViewById(R.id.beijing_changcheng2);
        jingdian_beijing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点长城
                Intent intent=new Intent(luntan_beijing_Activity.this,beijing_view_detail_Activity.class);
                startActivity(intent);

            }
        });
        guide=findViewById(R.id.luntan_daoyou);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到导游
                Intent intent=new Intent(luntan_beijing_Activity.this,guide_people_Activity.class);
                startActivity(intent);

            }
        });
        guide_rank=findViewById(R.id.luntan_daoyoubang);
        guide_rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到当地导游榜
                Intent intent=new Intent(luntan_beijing_Activity.this,guide_rank_Activity.class);
                startActivity(intent);

            }
        });
        together_trip=findViewById(R.id.luntan_youban);
        together_trip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到同成有伴
                Intent intent=new Intent(luntan_beijing_Activity.this,together_trip_Activity.class);
                startActivity(intent);

            }
        });
        QA_rank=findViewById(R.id.luntan_QA);
        QA_rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到问答
                Intent intent=new Intent(luntan_beijing_Activity.this,QA_Activity.class);
                startActivity(intent);

            }
        });
         beijing_me=findViewById(R.id.beijing_txt_user);
        beijing_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到论坛界面
                Intent intent=new Intent(luntan_beijing_Activity.this,luntan_start_menuActivity.class);
                startActivity(intent);

            }
        });
        beijing_luntan=findViewById(R.id.beijing_txt_more);
        beijing_luntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到”我“界面
                Intent intent=new Intent(luntan_beijing_Activity.this,user_menu_Activity.class);
                startActivity(intent);

            }
        });
         beijing_shouye=findViewById(R.id.beijing_txt_poi);
        beijing_shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到发现界面
//                Intent intent=new Intent( luntan_beijing_Activity.this,user_menu_Activity.class);
//                startActivity(intent);

            }
        });
          beijing_faxian=findViewById(R.id.beijing_txt_deal);
        beijing_faxian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到首页界面
                Intent intent=new Intent(luntan_beijing_Activity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        jingdian_nanluo=findViewById(R.id.beijing_nanluo);
        jingdian_nanluo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点南锣鼓巷
                Intent intent=new Intent(luntan_beijing_Activity.this,beijingnanluoguxing_detail_Activity.class);
                startActivity(intent);

            }
        });
        jingdian_nanluo1=findViewById(R.id.beijing_nanluo2);
        jingdian_nanluo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点南锣鼓巷
                Intent intent=new Intent(luntan_beijing_Activity.this,beijingnanluoguxing_detail_Activity.class);
                startActivity(intent);

            }
        });
        beijing_niaochao=findViewById(R.id.beijing_tiantan1);
        beijing_niaochao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点鸟巢
                Intent intent=new Intent(luntan_beijing_Activity.this,tiantan_Activity.class);
                startActivity(intent);

            }
        });
        beijing_niaochao1=findViewById(R.id.beijing_tiantan2);
        beijing_niaochao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点鸟巢
                Intent intent=new Intent(luntan_beijing_Activity.this,tiantan_Activity.class);
                startActivity(intent);

            }
        });
        beijing_tiantan=findViewById(R.id.beijing_niaochao1);
        beijing_tiantan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点天坛
                Intent intent=new Intent(luntan_beijing_Activity.this,niaochao_Activity.class);
                startActivity(intent);

            }
        });
        beijing_tiantan2=findViewById(R.id.beijing_niaochao2);
        beijing_tiantan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点天坛
                Intent intent=new Intent(luntan_beijing_Activity.this,niaochao_Activity.class);
                startActivity(intent);

            }
        });
        beijing_yiheyuan=findViewById(R.id.beijing_yiheyuan1);
        beijing_yiheyuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点颐和园
                Intent intent=new Intent(luntan_beijing_Activity.this,yiheyuan_Activity.class);
                startActivity(intent);

            }
        });
        beijing_yiheyuan1=findViewById(R.id.beijing_yiheyuan2);
        beijing_yiheyuan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到北京详细景点颐和园
                Intent intent=new Intent(luntan_beijing_Activity.this,yiheyuan_Activity.class);
                startActivity(intent);

            }
        });

    }
}
