package com.myapp.myapp.minion;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Activity2 extends AppCompatActivity {


    public static final String Extra_Name="com.myapp.myapp.myapplication.Extra_Name";

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;

    int num;
    int n;
    int points=0;
    String i;
   Button generate;
    Button done;
   TextView code;
    TextView codex;
     TextView answer;

    Random random;
    String str,point;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

      random=new Random();


        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six =(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        clear=(Button)findViewById(R.id.clear);

        codex = (TextView)findViewById(R.id.codex);
        code=(TextView)findViewById(R.id.code);
        answer=(TextView)findViewById(R.id.answer);
        done=(Button)findViewById(R.id.done);
        generate=(Button)findViewById(R.id.generate);

        code.setText(" ");

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //SET TIMER
            num = random.nextInt(2147483647-99999) + 99999;
                n=num;
                str=num+"";
                code.setText(" ");
            codex.setText(str);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    codex.setText("");
                }
            },2500);

            }
        });

            done.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view) {

                   i=code.getText().toString();
                    if(i.equals(" ")) {
                        Toast.makeText(Activity2.this, "enter the code", Toast.LENGTH_LONG).show();

                    }
                   else {
                        String pk=i.trim();
                        int j = Integer.parseInt(pk);
                        if (j == n) {
                            points += 10;

                            answer.setText("CORRECT!");
                        } else {
                            answer.setText("WRONG!");
                        }
                    }
                }
            });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText().toString()+"9");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code.getText().length()>0){
                    CharSequence name=code.getText().toString();
                    code.setText(name.subSequence(0,name.length()-1));
                }
                else{

                    code.setText(null);
                }
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(Activity2.this,Activity3.class);

                point=points+"";
                intent.putExtra(Extra_Name,point);

                startActivity(intent);
            }
        },60000);

    }
}

        //rd = new Random();
       // code = (EditText) findViewById(R.id.code);
        //answer = (TextView) findViewById(R.id.answer);
        //target = (TextView) findViewById(R.id.target);


        //target.setText("10");
        //String y=target.toString();
        //int tar=Integer.parseInt(y);
        //int tar = 10;
       // TextView textView = (TextView) findViewById(R.id.codex);
        //Button done = (Button) findViewById(R.id.done);
        //while(tar!=0) {


        //num = rd.nextInt(210 - 11) + 11;

        //int i = (int) num;
        //String g = "" + i;

        //TIME DELAY
        //textView.setText(g);


         //   tar--;
        //}


        //done.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  String x = code.getText().toString();
                //long t = Long.parseLong(x);

                //if (t == num) {

                  //  answer.setText("CORRECT!");
                    //points++;
                //} else {

                  //  answer.setText("WRONG!");
                //}
            //}
        //});

        //   tar--;
       //}
        //if (points == 10) {

          //  answer.setText("YOU WON!");
        //} else {
          //  String s = "YOU LOSE!";
         //   answer.setText(s);
        //}

          //  tar--;
        //}
          //   public method(){
             //   code = (EditText) findViewById(R.id.code);
            //    answer = (TextView) findViewById(R.id.answer);
               // target = (TextView) findViewById(R.id.target);


                //target.setText("10");
            //}
    //}

//}
