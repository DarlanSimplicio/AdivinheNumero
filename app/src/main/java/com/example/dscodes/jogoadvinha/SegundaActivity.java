package com.example.dscodes.jogoadvinha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class SegundaActivity extends AppCompatActivity {

    private ImageView btn ;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        btn = (ImageView) findViewById(R.id.botaoJogar) ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random() ;
                int i = random.nextInt(2);

                Intent intent = new Intent(SegundaActivity.this, JogarActivity.class) ;
                intent.putExtra("opcao", opcao[i]) ;

                startActivity(intent) ;
            }
        });




    }
}
