package com.example.shareferance;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    SharedPreferences sp;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.test);

        sp = getSharedPreferences("exe_1_sp", 0);

        int a=sp.getInt("exe_1_key",0);
        String b=sp.getString("exe_1_value","ok");

        tv1.setText(a+""+b);
    }
}
