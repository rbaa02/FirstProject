package alvarenga.brandao.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        renderiza elementos na tela
        setContentView(R.layout.activity_next);

//        captura o intent
        Intent i = getIntent();

//        captura o texto salvo no intent
        String texto = i.getStringExtra("texto");

//        captura o elemento TextView na tela
        TextView tv = findViewById(R.id.tvTextoEnviado);

//        seta o texto capturado no TextView
        tv.setText(texto);
    }
}