package com.epsi.wkshop.workshopb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    /**Bouton Ecoles et formations    */
    Button btn_Ecoles;
    /**Bouton Evénements    */
    Button btn_Event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Ecoles = findViewById(R.id.button2);
        btn_Event = findViewById(R.id.button4);


        btn_Ecoles.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //démarrage activité Ecoles
                startActivity(new Intent(MainActivity.this, EcolesActivity.class));
            }
        });

        btn_Event.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //démarrage activité évènements
                startActivity(new Intent(MainActivity.this, EventActivity.class));
            }
        });
    }
}
