package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button luntan_lead;
    private Button user_lead;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luntan_lead=findViewById(R.id.txt_user);
        luntan_lead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到论坛主界面
                Intent intent=new Intent(MainActivity.this,luntan_start_menuActivity.class);
                startActivity(intent);

            }
        });
        user_lead=findViewById(R.id.txt_more);
        user_lead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到“我”的界面
                Intent intent=new Intent(MainActivity.this,user_log_inActivity.class);
                startActivity(intent);

            }
        });
    }
}

