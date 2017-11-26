package com.example.user.u4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 24-12-2016.
 */
public class Sub211 extends Sub2_1 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub211);
        WebView wb=(WebView)findViewById(R.id.webView1);
        wb.getSettings().setJavaScriptEnabled(true);
         wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://drive.google.com/file/d/0Bxs-b2ia7uQWS2tack9SNnlUMnM/view?usp=drivesdk");
    }
}
