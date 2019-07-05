package com.cursoandroid.adivinha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogarId);
        textoResultado = findViewById(R.id.textoResultadoId);

        //textoResultado.setText("Texto alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(10);
                textoResultado.setText("Número escolhido: " + numeroAleatorio);

            }
        });

    }


}
