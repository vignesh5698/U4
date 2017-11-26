package com.example.user.u4;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 18-12-2016.
 */
public class Sub1_1 extends Sub1{
    //Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1_1);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.button5);
        b5=(Button)findViewById(R.id.button6);
        b6=(Button)findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub1_1.this,Sub111.class);
                startActivity(intent1);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub1_1.this,Sub112.class);
                startActivity(intent1);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub1_1.this,Sub113.class);
                startActivity(intent1);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub1_1.this,Sub114.class);
                startActivity(intent1);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub1_1.this,Sub115.class);
                startActivity(intent1);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub1_1.this,Sub116.class);
                startActivity(intent1);
            }
        });

    }
/* final String myHTTPurl1 = "https://www.vidyarthiplus.com/vp/attachment.php?aid=5272";
    final String myHTTPurl2 = "https://www.vidyarthiplus.com/vp/attachment.php?aid=5273";
    final String myHTTPurl3 = "https://www.vidyarthiplus.com/vp/attachment.php?aid=5274";
    final String myHTTPurl4 = "https://www.vidyarthiplus.com/vp/attachment.php?aid=5275";
    final String myHTTPurl5 = "https://www.vidyarthiplus.com/vp/attachment.php?aid=5276";

    final String myHTTPurl6 = "http://studentsfocus.com/wp-content/uploads/anna_univ/CSE/4SEM/MA6453%20-%20PQT/notes/104411_2013_regulation.pdf";
    final String myHTTPurl7 = "http://studentsfocus.com/wp-content/uploads/anna_univ/CSE/4SEM/MA6453%20-%20PQT/notes/104412_2013_regulation.pdf";
    final String myHTTPurl8 = "http://studentsfocus.com/wp-content/uploads/anna_univ/CSE/4SEM/MA6453%20-%20PQT/notes/104413_2013_regulation.pdf";
    final String myHTTPurl9 = "http://studentsfocus.com/wp-content/uploads/anna_univ/CSE/4SEM/MA6453%20-%20PQT/notes/104414_2013_regulation.pdf";
    final String myHTTPurl10 = "http://studentsfocus.com/wp-content/uploads/anna_univ/CSE/4SEM/MA6453%20-%20PQT/notes/104415_2013_regulation.pdf";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1_1);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button10);
        b7=(Button)findViewById(R.id.button11);
        b8=(Button)findViewById(R.id.button12);
        b9=(Button)findViewById(R.id.button13);
        b10=(Button)findViewById(R.id.button14);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl1));
                request.setTitle("Unit-1");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl1,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl1));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);

                //Toast.makeText(Sub1_1.this,"b1",Toast.LENGTH_LONG).show();
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl2));
                request.setTitle("Unit-2");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl2,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl2));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
             // Toast.makeText(Sub1_1.this,"b2",Toast.LENGTH_LONG).show();
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl3));
                request.setTitle("Unit-3");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl3,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl3));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
//Toast.makeText(Sub1_1.this,"b3",Toast.LENGTH_LONG).show();
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl4));
                request.setTitle("Unit-4");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl4,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl4));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
//Toast.makeText(Sub1_1.this,"b4",Toast.LENGTH_LONG).show();
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl5));
                request.setTitle("Unit-5");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl5,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl5));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent1=new Intent(Sub1_1.this,Sub111.class);
                //startActivity(intent1);

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl6));
                request.setTitle("Unit-1");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl6,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl6));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);

                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl7));
                request.setTitle("Unit-2");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl7,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl7));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl8));
                request.setTitle("Unit-3");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl8,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl8));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl9));
                request.setTitle("Unit-4");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl9,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl9));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myHTTPurl10));
                request.setTitle("Unit-5");
                request.setDescription("File is downloading");

                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile = URLUtil.guessFileName(myHTTPurl10,null, MimeTypeMap.getFileExtensionFromUrl(myHTTPurl10));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager downloadManager=((DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE));
                downloadManager.enqueue(request);
                Toast.makeText(Sub1_1.this,"Your file will be Downloaded..",Toast.LENGTH_LONG).show();

            }
        });

    }*/
}
