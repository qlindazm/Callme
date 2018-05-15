package com.example.mrlee.test;

import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {
    private EditText txtUser;
    private EditText txtPass;
    private Button butLogin;
    private Button butCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUser = (EditText) super.findViewById(R.id.txtUser);
        txtPass = (EditText)super.findViewById(R.id.txtPass);
        butLogin = (Button)super.findViewById(R.id.butLogin);
        butCall = (Button)super.findViewById(R.id.butCall);
        butLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String userStr = txtUser.getText().toString().trim();
                String passStr = txtPass.getText().toString().trim();
                if(userStr.equals("") || passStr.equals(""))
                    Toast.makeText(MainActivity.this, "不能为空", Toast.LENGTH_SHORT).show();
                if(passStr.equals("Dumbledore's Army"))
                {
                    Intent intent = new Intent(MainActivity.this, SecActivity.class);
                    ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(intent, transitionActivityOptions.toBundle());
                    //startActivity(intent);
                    finish();
                }
                else
                    Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
            }
        });
        butCall.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:13261363600");
                Intent it = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(it);
            }
        });

    }




}
