package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18-12-2016.
 */
public class Sub3_1 extends Sub3{
    Button bb1,bb2,bb3,bb4,bb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub3_1);

        bb1=(Button)findViewById(R.id.bt1);
        bb2=(Button)findViewById(R.id.bt4);
        bb3=(Button)findViewById(R.id.bt3);
        bb4=(Button)findViewById(R.id.bt45);
        bb5=(Button)findViewById(R.id.bt2);

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_1.this,Sub316.class);
                startActivity(intent1);
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_1.this,Sub317.class);
                startActivity(intent1);

            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_1.this,Sub318.class);
                startActivity(intent1);

            }
        });

        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_1.this,Sub319.class);
                startActivity(intent1);

            }
        });

        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub3_1.this,Sub320.class);
                startActivity(intent1);

            }
        });
    }
}
