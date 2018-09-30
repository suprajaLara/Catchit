package com.myapp.myapp.minion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    Button gotit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Intent intent=getIntent();

      gotit=(Button)findViewById(R.id.button);

        gotit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });


    }
    public void openActivity(){
        Intent intent=new Intent(Activity4.this,Activity2.class);
        startActivity(intent);
    }
    }

