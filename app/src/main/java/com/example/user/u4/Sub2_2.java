package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18-12-2016.
 */
public class Sub2_2 extends Sub2{
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2_2);

        b1=(Button)findViewById(R.id.button13);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub2_2.this,Sub214.class);
                startActivity(intent1);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub2_2.this,Sub215.class);
                startActivity(intent1);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub2_2.this,Sub216.class);
                startActivity(intent1);

            }
        });

    }
}
