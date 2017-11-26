package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18-12-2016.
 */
public class Sub2_1 extends Sub2{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2_1);
        Button mp1,mp2,mp3;
        mp1=(Button)findViewById(R.id.mpmc1);
        mp2=(Button)findViewById(R.id.mpmc2);
        mp3=(Button)findViewById(R.id.mpmc3);

        mp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub2_1.this,Sub211.class);
                startActivity(intent1);
            }
        });

        mp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Sub2_1.this,Sub212.class);
                startActivity(intent2);
            }
        });


        mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Sub2_1.this,Sub213.class);
                startActivity(intent3);
            }
        });


    }
}
