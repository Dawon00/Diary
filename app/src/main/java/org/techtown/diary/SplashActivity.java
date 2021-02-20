package org.techtown.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //전체화면만들기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //서버 연동
        //서버 연동이 되면 데이터 받기
        //데이터 받으면 메인 화면으로 넘기기

        Handler hd = new Handler();

        hd.postDelayed(new Runnable() {
            @Override
            public void run(){
                //화면전환
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish(); //2초 후(splash 끝나고) 화면을 전환시킨다
            }
        }, 2000);
    }
}