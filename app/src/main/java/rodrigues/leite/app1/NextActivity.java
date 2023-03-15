package rodrigues.leite.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent(); //Crinado uma variavel e pegando oq veio na intent
        String texto = intent.getStringExtra("texto"); //armazenando o texto da outra tela
        TextView tvExibir = findViewById(R.id.tvExibir); //pegando a textview
        tvExibir.setText(texto); //escrevendo o texto na textview
    }
}