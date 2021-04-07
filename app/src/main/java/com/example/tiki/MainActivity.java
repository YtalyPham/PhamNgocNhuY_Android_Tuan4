package com.example.tiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements sendData{
    TextView tvThanhTienMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvThanhTienMain=findViewById(R.id.tvThanhTienMain);
        Fragment fragment= BelowFragment.newInstance("1");
        getSupportFragmentManager().beginTransaction().add(R.id.frmContainerBelow,BelowFragment.newInstance("0")).commit();
    }


    @Override
    public void sendData(String data) {

    }
}