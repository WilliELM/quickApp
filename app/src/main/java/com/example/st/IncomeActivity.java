package com.example.st;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class IncomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
    }


    public void forwardToBudget(View view){
        EditText newEdit1 = findViewById(R.id.editTextTextPersonName3);
        EditText newEdit2 = findViewById(R.id.editTextTextPersonName6);

        String valueEdit1 = newEdit1.getText().toString();
        String valueEdit2 = newEdit2.getText().toString();

        Intent newIntent3 = new Intent(this, BudgetActivity.class);

        Intent intentFromUdgifter = getIntent();
        ArrayList <Integer> nmsArr = new ArrayList<>();
        nmsArr = intentFromUdgifter.getIntegerArrayListExtra("arraylist");
        nmsArr.add(Integer.parseInt(valueEdit1));
        nmsArr.add(Integer.parseInt(valueEdit2));
        newIntent3.putExtra("arraylist",nmsArr);
        startActivity(newIntent3);

    }
}