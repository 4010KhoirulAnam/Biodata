package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maps (View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.com/maps/place/Jl.+Sido+Luhur+V+No.8,+Muktiharjo+Kidul,+Kec.+Pedurungan,+Kota+Semarang,+Jawa+Tengah+50197/@-6.9759352,110.458595,17z/data=!3m1!4b1!4m5!3m4!1s0x2e708ccd7416afd5:0xf944c733f104db24!8m2!3d-6.9759405!4d110.4607837";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void panggil (View v){
        String nomor = "0812345678";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(memanggil);
    }

    public void email (View v){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("meesage/rtc822");
        String to = ("khrlanm02@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        startActivity(emailIntent);
    }
}