package com.chidii.alc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyProfile extends AppCompatActivity {

    String Title = "My Profile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        getSupportActionBar().setTitle(Title);
    }
}
