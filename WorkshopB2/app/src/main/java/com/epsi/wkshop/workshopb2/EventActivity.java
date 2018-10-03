package com.epsi.wkshop.workshopb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
/*
        String serveur = "http://portail-bluetooth.ml/api_REST/v1/index.php/";

        //Creer un connection vers le serveur
        HttpURLConnection Connexion = ConnexionUrlPost(serveur+"getEvent");

        //Convertie le string de l'adresse en URL
        URL url = new URL(AdresseServeur);

        //Ouvre une connection vers l'URL
        HttpsURLConnection connexion = (HttpsURLConnection) url.openConnection();

        //Permet l'envoie de donnees au serveur
        connexion.setDoOutput(true);

        //Tpye de requête HTTP
        connexion.setRequestMethod("GET");

        //Type de contenu de la requete HTTP
        connexion.setRequestProperty("Content-Type", "application/json");

        //Duree avant abandon de la requete
        connexion.setConnectTimeout(500);

        //Lancement connexion
        connexion.connect();

        //Recupere le code HTTP de la reponse du serveur
        int var =Connexion.getResponseCode();

        //Si le code HTTP est 200(compte ok)
        if (var == 200) {
            //Decode le flux de reponse en JSON
            JSONObject json =  DecoderEnJson(Connexion.getInputStream());

            //Suivant le statut dans la reponse
            switch (json.getJSONObject("Informations").get("Statut").toString())
            {
            */
    }
}
