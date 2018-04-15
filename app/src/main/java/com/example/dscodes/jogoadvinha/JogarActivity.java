package com.example.dscodes.jogoadvinha;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JogarActivity extends AppCompatActivity {

    private ImageView btnVoltar ;
    private ImageView imgMoeda ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogar);

        btnVoltar = (ImageView) findViewById(R.id.botaoVoltar) ;
        imgMoeda = (ImageView) findViewById(R.id.imgOpcao) ;


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JogarActivity.this, SegundaActivity.class)) ;
            }
        });

        Bundle extra = getIntent().getExtras() ;
        if(extra != null){

            if(extra.getString("opcao").equals("cara")){
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(JogarActivity.this, R.drawable.moeda_cara));
            }else {
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(JogarActivity.this, R.drawable.moeda_coroa));
            }
        }




    }
}
