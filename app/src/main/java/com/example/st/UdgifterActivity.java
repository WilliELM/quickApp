package com.example.st;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class UdgifterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udgifter);


    }
    public void onClick(View view){
        ArrayList<Integer> nmsArr = new ArrayList<>();
        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        EditText editText3 = findViewById(R.id.editTextNumber3);
        EditText editText4 = findViewById(R.id.editTextNumber4);

        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        String value3 = editText3.getText().toString();
        String value4 = editText4.getText().toString();

        nmsArr.add(Integer.parseInt(value1));
        nmsArr.add(Integer.parseInt(value2));
        nmsArr.add(Integer.parseInt(value3));
        nmsArr.add(Integer.parseInt(value4));
        Intent newIntent = new Intent(this, IncomeActivity.class);
        newIntent.putExtra("arraylist", nmsArr);
        startActivity(newIntent);
    }

}