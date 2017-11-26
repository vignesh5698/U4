package com.example.user.u4;

import android.os.Bundle;

/**
 * Created by user on 23-12-2016.
 */
    import java.io.InputStream;



    import android.app.Activity;
    import android.graphics.Bitmap;
    import android.graphics.BitmapFactory;
    import android.os.AsyncTask;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
    import android.widget.ImageSwitcher;
    import android.widget.ImageView;
    import android.widget.ViewSwitcher.ViewFactory;


public class Sub111 extends Sub1_1 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub111);

        WebView wb=(WebView)findViewById(R.id.wv1);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://drive.google.com/file/d/0Bxs-b2ia7uQWS3pKenJmaEFiR0k/view?usp=drivesdk");
    }
}
