package com.example.goyal.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void click (View view)
    {
        EditText editText = findViewById(R.id.edt);
        String name = editText.getText().toString();
        Toast.makeText(this, "Hello"+ name , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
