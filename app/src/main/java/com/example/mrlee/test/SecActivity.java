package com.example.mrlee.test;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowContentFrameStats;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class SecActivity extends AppCompatActivity {
    private long currentBackTime = 0;
    private long lastBackTime = 0;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;
    private ImageView img7;
    private ImageView img8;
    private ImageView img9;
    private ImageView img10;
    private ImageView img11;
    private ImageView img12;
    private boolean [] clickFlag = new boolean[12];
    private int cont = 0;
    private boolean createFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        //Transition slideTracition = TransitionInflater.from(this).inflateTransition(R.transition.slide_from_right);
        //getWindow().setEnterTransition(slideTracition);
        for(int i = 0; i<12; i++)clickFlag[i] = false;
        img1 = findViewById(R.id.imageView1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img1);
                intent.putExtra("txtSourse", R.string.strImg1);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img1, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());

                if(clickFlag[0] == false){
                    clickFlag[0] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img2 = findViewById(R.id.imageView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img2);
                intent.putExtra("txtSourse", R.string.strImg2);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img2, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[1] == false){
                    clickFlag[1] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img3 = findViewById(R.id.imageView3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img3);
                intent.putExtra("txtSourse", R.string.strImg3);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img3, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[2] == false){
                    clickFlag[2] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img4 = findViewById(R.id.imageView4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img4);
                intent.putExtra("txtSourse", R.string.strImg4);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img4, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[3] == false){
                    clickFlag[3] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img5 = findViewById(R.id.imageView5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img5);
                intent.putExtra("txtSourse", R.string.strImg5);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img5, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[4] == false){
                    clickFlag[4] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img6 = findViewById(R.id.imageView6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img6);
                intent.putExtra("txtSourse", R.string.strImg6);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img6, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[5] == false){
                    clickFlag[5] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img7 = findViewById(R.id.imageView7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img7);
                intent.putExtra("txtSourse", R.string.strImg7);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img7, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[6] == false){
                    clickFlag[6] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img8 = findViewById(R.id.imageView8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img8);
                intent.putExtra("txtSourse", R.string.strImg8);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img8, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[7] == false){
                    clickFlag[7] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img9 = findViewById(R.id.imageView9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img9);
                intent.putExtra("txtSourse", R.string.strImg9);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img9, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[8] == false){
                    clickFlag[8] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img10 = findViewById(R.id.imageView10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img10);
                intent.putExtra("txtSourse", R.string.strImg10);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img10, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[9] == false){
                    clickFlag[9] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img11 = findViewById(R.id.imageView11);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img11);
                intent.putExtra("txtSourse", R.string.strImg11);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img11, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[10] == false){
                    clickFlag[10] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        img12 = findViewById(R.id.imageView12);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.img12);
                intent.putExtra("txtSourse", R.string.strImg12);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this, img12, "transImg1");
                startActivity(intent, transitionActivityOptions.toBundle());
                if(clickFlag[11] == false){
                    clickFlag[11] = true;
                    cont++;
                }
                if(cont == 12 && createFlag == false){
                    createFlag = true;
                    allClicked();
                }
            }
        });
        //allClicked();
    }

    private void allClicked(){
        Button butHide = new Button(this);
        FrameLayout.LayoutParams param = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        param.gravity = Gravity.BOTTOM|Gravity.LEFT;
        butHide.setText("隐藏按钮");
        butHide.setGravity(Gravity.BOTTOM);
        butHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, Img1Activity.class);
                intent.putExtra("imgSourse", R.drawable.imghide);
                intent.putExtra("txtSourse", R.string.strImgHide);
                //ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(SecActivity.this);
                startActivity(intent);//, transitionActivityOptions.toBundle());
            }
        });
        this.addContentView(butHide, param);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK){
            currentBackTime = System.currentTimeMillis();

            if(currentBackTime - lastBackTime > 2 * 1000){
                Toast.makeText(this, "再按一次返回键退出", Toast.LENGTH_SHORT).show();
                lastBackTime = currentBackTime;
            }else{
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
