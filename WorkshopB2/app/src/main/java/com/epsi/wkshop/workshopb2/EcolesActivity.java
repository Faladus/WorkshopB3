package com.epsi.wkshop.workshopb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EcolesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecoles); //test
    }

    protected void showEpsi(View v){
        TextView txt = findViewById(R.id.epsiText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showWis(View v){
        TextView txt = findViewById(R.id.wisText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showIpi(View v){
        TextView txt = findViewById(R.id.ipiText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showTroisa(View v){
        TextView txt = findViewById(R.id.troisaText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showCbio(View v){
        TextView txt = findViewById(R.id.cbioText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showCefam(View v){
        TextView txt = findViewById(R.id.cefamText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showCfa(View v){
        TextView txt = findViewById(R.id.cfaText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }

    protected void showEsail(View v){
        TextView txt = findViewById(R.id.esailText);
        if(txt.getHeight() ==0)
            txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            txt.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
    }
}
