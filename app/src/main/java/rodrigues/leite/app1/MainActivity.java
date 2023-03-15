package rodrigues.leite.app1;

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
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //Criando uma variavél para armazenar o botão
        btnEnviar.setOnClickListener(new View.OnClickListener() { //quando o botão for acionado faça
            @Override
            public void onClick(View view) {
                //criação das variveis
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String texto = etDigiteAqui.getText().toString();

                //Criando a intent, passando a tela que estamos e a tela que iremos
                Intent intent = new Intent(MainActivity.this,NextActivity.class);

                //Mandando o texto para outra tela
                intent.putExtra("texto",texto);

                //Indo pra outra tela
                startActivity(intent);
            }
        });
    }
}