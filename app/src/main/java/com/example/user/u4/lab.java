package com.example.user.u4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 21-12-2016.
 */
public class lab extends MainActivity {
    Button b,o,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab);
        b=(Button)findViewById(R.id.button18);
        o=(Button)findViewById(R.id.button19);
        s=(Button)findViewById(R.id.button20);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab.this,B.class);
                startActivity(intent);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab.this,O.class);
                startActivity(intent);

            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab.this,S.class);
                startActivity(intent);

            }
        });
    }
}
