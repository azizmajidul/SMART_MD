package com.stmikbanisaleh.smart_md;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.stmikbanisaleh.smart_md.Model_Ok.Login2.Common.UserPreferense;
import com.stmikbanisaleh.smart_md.Ui.Masuk;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        //
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /*mulai activity ke MainActivity setelah 5 detik*/
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
            /*durasi 5000ms*/
        },2000);

//        if(UserPreferense.isLogin(this)){
//            startActivity(new Intent(this, MainActivity.class));
//        }else {
//            startActivity(new Intent(this, Masuk.class));
//        }
    }
}