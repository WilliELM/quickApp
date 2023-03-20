
package com.example.st;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class BudgetActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        Intent intentFromIncome = getIntent();

        Integer incomeTotal = intentFromIncome.getIntExtra("x", 2);
        Integer outcomeTotal = intentFromIncome.getIntExtra("x", 2);

        Integer sumOfTotal = (incomeTotal - outcomeTotal);

        TextView greenOrRedWord = findViewById(R.id.textView5);

        greenOrRedWord.setText("Summen af dine udgifter og indtægter:" + sumOfTotal);

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