package com.var.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.var.dagger2.modle.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);

        Log.i("Dagger2", user.getName());
    }
}
