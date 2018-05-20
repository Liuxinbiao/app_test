package com.example.bilibili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class user_settingActivity extends AppCompatActivity {
    private TextView user_person_data,user_privacy,user_ID_manger,cache_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setting);
        user_person_data=findViewById(R.id.setting_person);
        user_person_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"设置"界面下面的个人资料界面
                Intent intent=new Intent(user_settingActivity.this,user_person_data_Activity.class);
                startActivity(intent);

            }
        });
        user_privacy=findViewById(R.id.setting_privacy);
        user_privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"设置"界面下面的隐私设置界面
                Intent intent=new Intent(user_settingActivity.this,user_pravicy_Activity.class);
                startActivity(intent);

            }
        });
        user_ID_manger=findViewById(R.id.setting_binging);
        user_ID_manger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"设置"界面下面的账号界面
                Intent intent=new Intent(user_settingActivity.this,user_id_bind_manager_Activity.class);
                startActivity(intent);

            }
        });
        cache_manager=findViewById(R.id.setting_store);
        cache_manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到"设置"界面下面的缓存界面
                Intent intent=new Intent(user_settingActivity.this,user_cache_managerActivity.class);
                startActivity(intent);

            }
        });
    }
}
