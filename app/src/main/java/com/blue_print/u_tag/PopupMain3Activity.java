package com.blue_print.u_tag;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PopupMain3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        WindowManager.LayoutParams  layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags  = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        getWindow().setAttributes(layoutParams);
        setContentView(R.layout.activity_popup_main3);
//        getWindow().getAttributes().width=2000;
//        getWindow().getAttributes().height=2000;
//        getWindow().getAttributes().width   = (int)(PopupMain3Activity.getInstance().getDisplayMetrics().widthPixels * 0.9);
//        getWindow().getAttributes().height  = (int)(PopupMain3Activity.getInstance().getDisplayMetrics().heightPixels * 0.4);




        findViewById(R.id.c1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:01091420327")));
            }
        });findViewById(R.id.c2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:01044299871")));
            }
        });findViewById(R.id.c3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:01089204430 ")));
            }
        });findViewById(R.id.c4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:01020280472 ")));
            }
        });
    }
}
