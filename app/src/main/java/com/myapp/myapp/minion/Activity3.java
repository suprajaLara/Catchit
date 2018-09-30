package com.myapp.myapp.minion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView score;
    String name;
    Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final Intent intent=getIntent();
        score=(TextView)findViewById(R.id.score);

     name=intent.getStringExtra(Activity2.Extra_Name);

        score.setText(name);

        restart=(Button)findViewById(R.id.button);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Activity3.this,Activity2.class);
                startActivity(intent1);

            }
        });
    }

    @Override
    public void onBackPressed() {

        Intent intent=new Intent(Activity3.this,MainActivity.class);
        startActivity(intent);
       finish();


    }
}
