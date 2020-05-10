package com.mrpds.androidservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnStartService, btnStartIntentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //handle StartService
        btnStartService = (Button)findViewById(R.id.btn_start_service);
        btnStartService.setOnClickListener(this);

        //handle StartIntentService
        btnStartIntentService = (Button)findViewById(R.id.btn_start_intent_service);
        btnStartIntentService.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start_service:
                Intent mStartServiceIntent = new Intent(MainActivity.this,OriginService.class);
                startService(mStartServiceIntent);
                break;
            case  R.id.btn_start_intent_service:
                break;
        }
    }
}
