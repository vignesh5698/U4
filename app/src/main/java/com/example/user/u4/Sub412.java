package com.example.user.u4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 25-12-2016.
 */
public class Sub412 extends Sub4_1{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub412);
        WebView wb=(WebView)findViewById(R.id.a2);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://drive.google.com/file/d/0Bxs-b2ia7uQWNUdGTVYtY29ITkE/view?usp=drivesdk");
    }
}
