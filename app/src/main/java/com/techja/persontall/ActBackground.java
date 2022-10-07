package com.techja.persontall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.techja.persontall.databinding.ActBgBinding;
import com.techja.persontall.databinding.ActM001Binding;

public class ActBackground extends AppCompatActivity {
    private ActBgBinding biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActBgBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());

        initViews();
    }

    private void initViews() {
        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 2000);
    }
}