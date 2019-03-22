package com.example.movieticketbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HowToTrainYourDragon extends AppCompatActivity {

    Button button;
    String buttonText;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.howtotrainyourdragon);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.time1:
                button = (Button)findViewById(R.id.time1);
                buttonText = button.getText().toString();
                i = new Intent(HowToTrainYourDragon.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            case R.id.time2:
                button = (Button)findViewById(R.id.time2);
                buttonText = button.getText().toString();
                Intent i = new Intent(HowToTrainYourDragon.this, Food_Drink.class);
                i.putExtra("key",buttonText);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
