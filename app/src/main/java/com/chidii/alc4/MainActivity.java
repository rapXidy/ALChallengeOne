package com.chidii.alc4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnprofile, btnaboutALC;
    //private WebView wvAboutALC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnprofile = (Button) findViewById(R.id.buttonMyProfile);
        btnaboutALC = (Button) findViewById(R.id.buttonAboutALC);

        //wvAboutALC = (WebView) findViewById(R.id.wvAboutAlc);

        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewProfile();

            }
        });

        btnaboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewAboutALC();
            }
        });
    }

    private void viewAboutALC() {
        Intent i = new Intent(MainActivity.this, aboutALC.class);
        startActivity(i);
    }

    private void viewProfile() {
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
    }
}
