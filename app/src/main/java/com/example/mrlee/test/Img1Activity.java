
package com.example.mrlee.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Img1Activity extends AppCompatActivity {
    private ImageView img;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img1);
        Intent intent = super.getIntent();
        img = findViewById(R.id.imageView);
        img.setImageResource(intent.getIntExtra("imgSourse", R.drawable.img1));
        txt = findViewById(R.id.textView);
        txt.setText(intent.getIntExtra("txtSourse", R.string.strDefult));
        txt.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
