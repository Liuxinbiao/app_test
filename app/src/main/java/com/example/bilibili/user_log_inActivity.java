package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user_log_inActivity extends AppCompatActivity {
    private Button log_in,u_log_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_log_in);

        log_in=findViewById(R.id.log_in);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登陆成功跳转到"我"界面
                Intent intent=new Intent(user_log_inActivity.this,user_menu_Activity.class);
                startActivity(intent);

            }
        });
        u_log_out=findViewById(R.id.log_out);
        u_log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到注册界面下
                Intent intent=new Intent(user_log_inActivity.this,user_log_out_Activity.class);
                startActivity(intent);

            }
        });
    }
}
