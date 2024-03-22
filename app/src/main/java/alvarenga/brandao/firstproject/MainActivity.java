package alvarenga.brandao.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        renderiza elementos na tela
        setContentView(R.layout.activity_main);

//        captura o Button na tela
        Button btnEnviar = findViewById(R.id.btnEnviar);

//        adiciona um "ouvidor de eventos" de quando clicam no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override

//            funcao que executa toda vez que o botao e clicado
            public void onClick(View v) {
//                pega elemento EditText na tela
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

//                pega o texto digitado no EditText
                String textoDigitado = etDigiteAqui.getText().toString();

//                cria um intent para navegar de uma tela pra outra
                Intent i = new Intent(MainActivity.this, NextActivity.class);

//                adiciona o texto na intent atraves do putExtra
                i.putExtra("texto", textoDigitado);

//                abre a segunda tela
                startActivity(i);
            }
        });
    }
}