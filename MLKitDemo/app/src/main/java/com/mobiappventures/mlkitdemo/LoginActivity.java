package com.mobiappventures.mlkitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    Button buttologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // ButterKnife.bind(this);
        buttologin = (Button)findViewById(R.id.buttologin);
        buttologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onLoginClick();
            }
        });
    }

    void onLoginClick()
    {
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

}
