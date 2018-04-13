package com.example.dscodes.jogoadvinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn ;
    private TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.botao) ;
        result = (TextView) findViewById(R.id.resultado) ;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("Nº sorteado: " + randomica());
            }
        });
    }

    private int randomica(){

        Random random = new Random() ;
        return random.nextInt(11) ;
    }



}
