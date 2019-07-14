package com.chidii.alc4;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class aboutALC extends AppCompatActivity {

    private WebView wvAboutALC;

    String Title = "About ALC";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setTitle(Title);


        wvAboutALC = (WebView) findViewById(R.id.wvAboutAlc);
        wvAboutALC.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });

        Toast.makeText(this, "please wait...", Toast.LENGTH_LONG).show();
        openWebView();

    }

    private void openWebView() {
        wvAboutALC.loadUrl("https://andela.com/alc/");
        wvAboutALC.getSettings().setJavaScriptEnabled(true);
        wvAboutALC.getSettings().setLoadWithOverviewMode(true);
        wvAboutALC.getSettings().setUseWideViewPort(true);
    }

    @Override
    public void onBackPressed() {
        if (wvAboutALC.canGoBack()) {
            wvAboutALC.goBack();
        } else {

        super.onBackPressed();
        }
    }
}
