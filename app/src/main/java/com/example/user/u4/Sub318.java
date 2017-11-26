package com.example.user.u4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 25-12-2016.
 */
public class Sub318 extends Sub3_1{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub318);
        WebView wb=(WebView)findViewById(R.id.z3);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://drive.google.com/file/d/0Bxs-b2ia7uQWeEpDUzFCZDRob1E/view?usp=drivesdk");
    }
}
