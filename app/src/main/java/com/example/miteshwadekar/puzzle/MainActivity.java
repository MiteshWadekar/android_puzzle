package com.example.miteshwadekar.puzzle;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView f ;
    TextView t2,t3,t4,t5,wire;
    TextView t6,t7,t8,t9,t10,paint;
    TextView t12,t13,t14,t15,code;
    TextView t16,t17,t18,t19,t20,habit;
    TextView t22,t23,t24,t25,aces;
    boolean b_t2,b_t3,b_t4,b_t5,b_t6,b_t7,b_t8,b_t9,b_t10,b_t12,b_t13,b_t14,b_t15;
    boolean b_t16,b_t17,b_t18,b_t19,b_t20,b_t22,b_t23,b_t24,b_t25;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f = (TextView)findViewById(R.id.find);
        wire = (TextView)findViewById(R.id.wire);
        t2 = (TextView) findViewById(R.id.tv2);
        t2.setOnClickListener(this);
        t3 = (TextView) findViewById(R.id.tv3);
        t3.setOnClickListener(this);
        t4 = (TextView) findViewById(R.id.tv4);
        t4.setOnClickListener(this);
        t5 = (TextView) findViewById(R.id.tv5);
        t5.setOnClickListener(this);
        t6 = (TextView) findViewById(R.id.tv6);
        t6.setOnClickListener(this);
        t7 = (TextView) findViewById(R.id.tv7);
        t7.setOnClickListener(this);
        t8 = (TextView) findViewById(R.id.tv8);
        t8.setOnClickListener(this);
        t9 = (TextView) findViewById(R.id.tv9);
        t9.setOnClickListener(this);
        t10 = (TextView) findViewById(R.id.tv10);
        t10.setOnClickListener(this);
        paint = (TextView) findViewById(R.id.paint);
        t12 = (TextView) findViewById(R.id.tv12);
        t12.setOnClickListener(this);
        t13 = (TextView) findViewById(R.id.tv13);
        t13.setOnClickListener(this);
        t14 = (TextView) findViewById(R.id.tv14);
        t14.setOnClickListener(this);
        t15 = (TextView) findViewById(R.id.tv15);
        t15.setOnClickListener(this);
        code = (TextView) findViewById(R.id.code);
        t16 = (TextView) findViewById(R.id.tv16);
        t16.setOnClickListener(this);
        t17 = (TextView) findViewById(R.id.tv17);
        t17.setOnClickListener(this);
        t18 = (TextView) findViewById(R.id.tv18);
        t18.setOnClickListener(this);
        t19 = (TextView) findViewById(R.id.tv19);
        t19.setOnClickListener(this);
        t20 = (TextView) findViewById(R.id.tv20);
        t20.setOnClickListener(this);
        habit = (TextView)findViewById(R.id.habit);
        t22 = (TextView) findViewById(R.id.tv22);
        t22.setOnClickListener(this);
        t23 = (TextView) findViewById(R.id.tv23);
        t23.setOnClickListener(this);
        t24 = (TextView) findViewById(R.id.tv24);
        t24.setOnClickListener(this);
        t25 = (TextView) findViewById(R.id.tv25);
        t25.setOnClickListener(this);
        aces = (TextView)findViewById(R.id.aces);
    }
    public void onClick(View v)
    {
        if(v.getId() == R.id.tv2){
            b_t2 = true;
            check();
        }
        if(v.getId() == R.id.tv3){
            b_t3 = true;
            check();
        }
        if(v.getId() == R.id.tv4){
            b_t4 = true;
            check();
        }
        if(v.getId() == R.id.tv5){
            b_t5 = true;
            check();
        }
        if(v.getId() == R.id.tv6){
            b_t6 = true;
            check();
        }
        if(v.getId() == R.id.tv7){
            b_t7 = true;
            check();
        }
        if(v.getId() == R.id.tv8){
            b_t8 = true;
            check();
        }
        if(v.getId() == R.id.tv9){
            b_t9 = true;
            check();
        }
        if(v.getId() == R.id.tv10){
            b_t10 = true;
            check();
        }
        if(v.getId() == R.id.tv12){
            b_t12 = true;
            check();
        }
        if(v.getId() == R.id.tv13){
            b_t13 = true;
            check();
        }
        if(v.getId() == R.id.tv14){
            b_t14 = true;
            check();
        }
        if(v.getId() == R.id.tv15){
            b_t15 = true;
            check();
        }
        if(v.getId() == R.id.tv16){
            b_t16 = true;
            check();
        }
        if(v.getId() == R.id.tv17){
            b_t17 = true;
            check();
        }
        if(v.getId() == R.id.tv18){
            b_t18 = true;
            check();
        }
        if(v.getId() == R.id.tv19){
            b_t19 = true;
            check();
        }
        if(v.getId() == R.id.tv20){
            b_t20 = true;
            check();
        }
        if(v.getId() == R.id.tv22){
            b_t22 = true;
            check();
        }
        if(v.getId() == R.id.tv23){
            b_t23 = true;
            check();
        }
        if(v.getId() == R.id.tv24){
            b_t24 = true;
            check();
        }
        if(v.getId() == R.id.tv25){
            b_t25 = true;
            check();
        }


    }
    public void check()
    {
        if(b_t2 == true && b_t3 == true && b_t4 == true && b_t5 == true)
        {
            t2.setBackgroundColor(Color.parseColor("#F1C40F"));
            t3.setBackgroundColor(Color.parseColor("#F1C40F"));
            t4.setBackgroundColor(Color.parseColor("#F1C40F"));
            t5.setBackgroundColor(Color.parseColor("#F1C40F"));
            wire.setText(" ");

        }
        if(b_t6 == true && b_t7 == true && b_t8 == true && b_t9 == true && b_t10 == true)
        {
            t6.setBackgroundColor(Color.parseColor("#F1C40F"));
            t7.setBackgroundColor(Color.parseColor("#F1C40F"));
            t8.setBackgroundColor(Color.parseColor("#F1C40F"));
            t9.setBackgroundColor(Color.parseColor("#F1C40F"));
            t10.setBackgroundColor(Color.parseColor("#F1C40F"));
            paint.setText(" ");

        }
        if(b_t12 == true && b_t13 == true && b_t14 == true && b_t15 == true )
        {
            t12.setBackgroundColor(Color.parseColor("#F1C40F"));
            t13.setBackgroundColor(Color.parseColor("#F1C40F"));
            t14.setBackgroundColor(Color.parseColor("#F1C40F"));
            t15.setBackgroundColor(Color.parseColor("#F1C40F"));
            code.setText(" ");

        }
        if(b_t16 == true && b_t17 == true && b_t18 == true && b_t19 == true && b_t20 == true)
        {
            t16.setBackgroundColor(Color.parseColor("#F1C40F"));
            t17.setBackgroundColor(Color.parseColor("#F1C40F"));
            t18.setBackgroundColor(Color.parseColor("#F1C40F"));
            t19.setBackgroundColor(Color.parseColor("#F1C40F"));
            t20.setBackgroundColor(Color.parseColor("#F1C40F"));
            habit.setText(" ");

        }
        if(b_t22 == true && b_t23 == true && b_t24 == true && b_t25 == true )
        {
            t22.setBackgroundColor(Color.parseColor("#F1C40F"));
            t23.setBackgroundColor(Color.parseColor("#F1C40F"));
            t24.setBackgroundColor(Color.parseColor("#F1C40F"));
            t25.setBackgroundColor(Color.parseColor("#F1C40F"));
            aces.setText(" ");

        }
        if(aces.getText()== " " && habit.getText() == " " && code.getText() == " " && paint.getText() == " " && wire.getText() == " ")
        {
            f.setText("DONE !");
        }
    }


}
