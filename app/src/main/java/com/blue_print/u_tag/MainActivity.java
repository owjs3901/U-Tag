package com.blue_print.u_tag;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Activity m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlphaAnimation animation1 = new AlphaAnimation(1f, 0f);

        animation1.setDuration(1000);
        animation1.setStartOffset(1000);
        animation1.setFillAfter(true);
        final ImageView iv = (ImageView) findViewById(R.id.load);
        iv.startAnimation(animation1);
        m=this;

        if (ContextCompat.checkSelfPermission(m,
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(m, new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        findViewById(R.id.em).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:119")));
            }
        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(m,Main2Activity.class));
            }
        });


        findViewById(R.id.call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(m,PopupMain3Activity.class));
            }
        });
    }
}
