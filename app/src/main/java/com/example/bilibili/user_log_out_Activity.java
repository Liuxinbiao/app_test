package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user_log_out_Activity extends AppCompatActivity {
    private Button log_out2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_log_out_);

        log_out2=findViewById(R.id.user_button2);
        log_out2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注册成功跳转到首页
                Intent intent=new Intent(user_log_out_Activity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
