package com.example.user.u4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 25-12-2016.
 */
public class Sub215 extends Sub2_2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub215);
        WebView wb=(WebView)findViewById(R.id.w2);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://drive.google.com/file/d/0Bxs-b2ia7uQWUW55X0g4aHBUX00/view?usp=drivesdk");
    }
}
