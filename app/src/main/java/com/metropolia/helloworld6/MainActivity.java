package com.metropolia.helloworld6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random randomGenerator = new Random();
    private int button_result;
    private int random_result;

    private void youWin(TextView textview){
        textview.setText("You WIN!");
    }

    private void youLose(TextView textview){
        textview.setText("You LOSE!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView result = (TextView) findViewById(R.id.result);
        final TextView answer = (TextView) findViewById(R.id.answer);

        random_result = randomGenerator.nextInt(12);

        final Button reset = (Button) findViewById(R.id.reset);
        final Button tammi = (Button) findViewById(R.id.tammi);
        final Button helmi = (Button) findViewById(R.id.helmi);
        final Button maalis = (Button) findViewById(R.id.maalis);
        final Button huhti = (Button) findViewById(R.id.huhti);
        final Button touko = (Button) findViewById(R.id.touko);
        final Button kesad = (Button) findViewById(R.id.kesad);
        final Button heinad = (Button) findViewById(R.id.heinad);
        final Button elo = (Button) findViewById(R.id.elo);
        final Button syys = (Button) findViewById(R.id.syys);
        final Button loka = (Button) findViewById(R.id.loka);
        final Button marras = (Button) findViewById(R.id.marras);
        final Button joulu = (Button) findViewById(R.id.joulu);

        tammi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 0;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: January");
                }
                else {
                    youLose(result);
                }
            }
        });
        helmi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 1;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: February");
                }
                else {
                    youLose(result);
                }
            }
        });
        maalis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 2;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: March");
                }
                else {
                    youLose(result);
                }
            }
        });
        huhti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 3;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: April");
                }
                else {
                    youLose(result);
                }
            }
        });
        touko.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 4;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: May");
                }
                else {
                    youLose(result);
                }
            }
        });
        kesad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 5;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: June");
                }
                else {
                    youLose(result);
                }
            }
        });
        heinad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 6;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: July");
                }
                else {
                    youLose(result);
                }
            }
        });
        elo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 7;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: August");
                }
                else {
                    youLose(result);
                }
            }
        });
        syys.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 8;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: September");
                }
                else {
                    youLose(result);
                }
            }
        });
        loka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 9;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: October");
                }
                else {
                    youLose(result);
                }
            }
        });
        marras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 10;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: November");
                }
                else {
                    youLose(result);
                }
            }
        });
        joulu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_result = 11;
                if (button_result == random_result) {
                    youWin(result);
                    answer.setText("Answer: December");
                }
                else {
                    youLose(result);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                random_result = randomGenerator.nextInt(12);
                result.setText("Select month");
                answer.setText("");
            }
        });
    }
}
