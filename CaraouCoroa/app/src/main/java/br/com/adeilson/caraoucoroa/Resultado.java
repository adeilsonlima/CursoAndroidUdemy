package br.com.adeilson.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import br.com.adeilson.caraoucoroa.MainActivity.Valores;

public class Resultado extends AppCompatActivity {

    private ImageView moeda;
    private ImageView botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        moeda = (ImageView) findViewById(R.id.moedaId);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);

        Bundle extra = getIntent().getExtras();

        if (extra!=null){
            //int opcao = extra.getInt("opcao");
            Valores opcao = (Valores) extra.get("opcao");

            if(opcao == Valores.CARA){
                //cara
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                //coroa
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Resultado.this, MainActivity.class));
                finish();
            }
        });
    }
}
