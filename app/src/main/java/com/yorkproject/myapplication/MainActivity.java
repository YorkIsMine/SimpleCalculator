package com.yorkproject.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Calculator");
    }
    public void onClick(View view){
        EditText editText = findViewById(R.id.editText);
        switch (view.getId()){
            case R.id.four:
                editText.setText("4");
                break;
            case R.id.five:
                editText.setText("5");
                break;
            case R.id.plus:
                editText.setText("+");
                break;
            case R.id.delete:
                editText.setText("");
                break;
        }
    }
}
