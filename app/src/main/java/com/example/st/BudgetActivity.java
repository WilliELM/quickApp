
package com.example.st;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class BudgetActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        Intent intentFromIncome = getIntent();
        ArrayList <Integer> finalArraylist = intentFromIncome.getIntegerArrayListExtra("arraylist2");
        int incomeTotal = finalArraylist.get(4) + finalArraylist.get(5);
        int outcomeTotal = finalArraylist.get(0) + finalArraylist.get(1) + finalArraylist.get(2) + finalArraylist.get(3);

        int sumOfTotal = (incomeTotal - outcomeTotal);

        TextView greenOrRedWord = findViewById(R.id.textView5);
        TextView sumText = findViewById(R.id.textView4);

        sumText.setText("Summen af dine udgifter og indtægter:");
        greenOrRedWord.setText(Integer.toString(sumOfTotal));

        greenOrRedNumbers(sumOfTotal);
    }


    public void greenOrRedNumbers (int sumOfNumbers){
        TextView greenOrRedWord = findViewById(R.id.textView5);

        if (sumOfNumbers > 0){
            greenOrRedWord.setTextColor(this.getResources().getColor(R.color.teal_200));
        } else {
            greenOrRedWord.setTextColor(this.getResources().getColor(R.color.purple_700));
        }
    }
}