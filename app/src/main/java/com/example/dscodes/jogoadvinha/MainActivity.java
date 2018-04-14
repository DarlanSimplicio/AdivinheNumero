package com.example.dscodes.jogoadvinha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn ;
    private Button btnProxi ;
    private TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.botao) ;
        btnProxi = (Button) findViewById(R.id.btnProxima);
        result = (TextView) findViewById(R.id.resultado) ;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("Nº sorteado: " + randomica());
                Toast.makeText(getApplicationContext(), "O jogo foi inciado..", Toast.LENGTH_SHORT).show();
            }
        });

        btnProxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nova Aplicação Aberta!", Toast.LENGTH_LONG ).show();
                startActivity(new Intent(MainActivity.this, SegundaActivity.class)) ;
            }
        });
    }

    private int randomica(){

        Random random = new Random() ;
        return random.nextInt(11) ;
    }



}
