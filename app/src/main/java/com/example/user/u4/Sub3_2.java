package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18-12-2016.
 */
public class Sub3_2 extends Sub3{
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub3_2);
        b1=(Button)findViewById(R.id.button8);
        b2=(Button)findViewById(R.id.button9);
        b3=(Button)findViewById(R.id.button10);
        b4=(Button)findViewById(R.id.button11);
        b5=(Button)findViewById(R.id.button12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_2.this,Sub311.class);
                startActivity(intent1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_2.this,Sub312.class);
                startActivity(intent1);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_2.this,Sub313.class);
                startActivity(intent1);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_2.this,Sub314.class);
                startActivity(intent1);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_2.this,Sub315.class);
                startActivity(intent1);


            }
        });
    }
}
