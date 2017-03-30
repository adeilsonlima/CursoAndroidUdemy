package br.com.adeilson.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    public enum Valores { CARA, COROA;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.botaoJogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int aleatorio = random.nextInt(2);

                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("opcao", Valores.values()[aleatorio]);

                Toast toast = Toast.makeText(getApplicationContext(), Valores.values()[aleatorio].toString(), Toast.LENGTH_SHORT);
                toast.show();

                startActivity(intent);
            }
        });
    }
}
