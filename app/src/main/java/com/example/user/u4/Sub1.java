package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18-12-2016.
 */
public class Sub1 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1);
        Button b1,b2,b3;
        b1=(Button)findViewById(R.id.button21);
        b2=(Button)findViewById(R.id.button22);
        b3=(Button)findViewById(R.id.button23);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Sub1.this,Sub1_1.class);
                startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Sub1.this,Sub1_2.class);
                startActivity(intent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Sub1.this,Sub1_3.class);
                startActivity(intent);

            }
        });
    }
}
