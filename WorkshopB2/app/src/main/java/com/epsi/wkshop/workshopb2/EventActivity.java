package com.epsi.wkshop.workshopb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://robinbalmadier.freeboxos.fr/eventAppli.php");
    }
}
