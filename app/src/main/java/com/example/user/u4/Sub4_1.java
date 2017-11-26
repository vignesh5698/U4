package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18-12-2016.
 */
public class Sub4_1 extends Sub4{
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub4_1);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt4);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt45);
        b5=(Button)findViewById(R.id.bt2);
        b6=(Button)findViewById(R.id.button16);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sub4_1.this,Sub411.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sub4_1.this,Sub412.class);
                startActivity(intent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sub4_1.this,Sub413.class);
                startActivity(intent);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sub4_1.this,Sub414.class);
                startActivity(intent);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sub4_1.this,Sub415.class);
                startActivity(intent);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sub4_1.this,Sub416.class);
                startActivity(intent);

            }
        });
    }
}
