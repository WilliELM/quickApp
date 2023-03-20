package com.example.st;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class Udgifter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udgifter);
        ArrayList<Integer> nmsArr = new ArrayList<>();

        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        EditText editText3 = findViewById(R.id.editTextNumber3);
        EditText editText4 = findViewById(R.id.editTextNumber4);

        nmsArr.add(Integer.parseInt(editText1.toString()));
        nmsArr.add(Integer.parseInt(editText2.toString()));
        nmsArr.add(Integer.parseInt(editText3.toString()));
        nmsArr.add(Integer.parseInt(editText4.toString()));

        Intent newIntent = new Intent(this, IncomeActivity.class);
        newIntent.putExtra("arraylist", nmsArr);
        startActivity(newIntent);
    }
}