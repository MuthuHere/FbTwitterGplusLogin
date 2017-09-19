package com.colan.fblogintest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by CIPL0468 on 9/18/2017.
 */

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnFB, btnTwitter;
    private Intent intent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        btnFB = (Button) findViewById(R.id.btnFB);
        btnTwitter = (Button) findViewById(R.id.btnTwitter);

        btnFB.setOnClickListener(this);
        btnTwitter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btnFB: {
                intent = new Intent(this, FbActivity.class);
            }
            break;
            case R.id.btnTwitter: {
                intent = new Intent(this, TwitterActivity.class);
            }
            break;
        }
        startActivity(intent);
    }
}
