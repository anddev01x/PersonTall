package com.techja.persontall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.techja.persontall.databinding.ActM001Binding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActM001Binding biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActM001Binding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());

        initViews();
    }

    private void initViews() {
        biding.btCheck.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bt_check) {
            doClickButton();
        }
    }

    private void doClickButton() {
        if (check()) {
            String s = biding.tv01.getText().toString();
            Toast toast = Toast.makeText(this, "Chiều cao của bạn là " + s + " cm", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 20, 30);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Chiều cao không hợp lệ!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 20, 30);
            toast.show();
        }
    }

    private boolean check() {
        String s = biding.tv01.getText().toString();
        int num = Integer.parseInt(s);
        if (num < 100 || num > 250) {
            return false;
        } else {
            return true;
        }
    }
}