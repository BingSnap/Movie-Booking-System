package com.example.movieticketbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CaptainMarvel extends AppCompatActivity {

    Button button;
    String buttonText;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.captainmarvel);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.time1:
                button = (Button)findViewById(R.id.time1);
                buttonText = button.getText().toString();
                i = new Intent(CaptainMarvel.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            case R.id.time2:
                button = (Button)findViewById(R.id.time2);
                buttonText = button.getText().toString();
                Intent i = new Intent(CaptainMarvel.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            case R.id.time3:
                button = (Button)findViewById(R.id.time3);
                buttonText = button.getText().toString();
                i = new Intent(CaptainMarvel.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            case R.id.time4:
                button = (Button)findViewById(R.id.time4);
                buttonText = button.getText().toString();
                i = new Intent(CaptainMarvel.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            case R.id.time5:
                button = (Button)findViewById(R.id.time5);
                buttonText = button.getText().toString();
                i = new Intent(CaptainMarvel.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            case R.id.time6:
                button = (Button)findViewById(R.id.time6);
                buttonText = button.getText().toString();
                i = new Intent(CaptainMarvel.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
