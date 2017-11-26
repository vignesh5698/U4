package com.example.user.u4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 23-12-2016.
 */
public class Sub112 extends Sub1_1 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub112);

        WebView wb=(WebView)findViewById(R.id.wv2);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://drive.google.com/file/d/0Bxs-b2ia7uQWOUV5WXduVkh4dUU/view?usp=drivesdk");
    }

}
