package br.com.adeilson.minhasanotacoes;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends Activity {

    private EditText text;
    private ImageView botaoSalvar;
    private static final String NOME_ARQUIVO = "anotacao.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.textoId);
        botaoSalvar = (ImageView) findViewById(R.id.botaoSalvarId);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = text.getText().toString();
                salvarNoArquivo(textoDigitado);

                Toast.makeText(getApplicationContext(), R.string.texto_salvo, Toast.LENGTH_SHORT).show();
            }
        });

        String textoGravado = "";
        if ((textoGravado =lerArquivo())!=null){
            text.setText(textoGravado);
        }


    }

    private void salvarNoArquivo(String texto){
       try {
           OutputStream arquivo = openFileOutput(NOME_ARQUIVO, Context.MODE_PRIVATE);
           OutputStreamWriter outputStreamWriter = new OutputStreamWriter(arquivo);
           outputStreamWriter.write(texto);
           outputStreamWriter.close();

       }catch (IOException e){
           Log.v("MainActivity", e.toString());
       }
    }

    private String lerArquivo(){
        String resultado = "";
        try {
            InputStream arquivo = openFileInput(NOME_ARQUIVO);
            if(arquivo!= null){
                InputStreamReader inputStreamReader = new InputStreamReader(arquivo);

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String linhaArquivo = "";

                while ((linhaArquivo = bufferedReader.readLine()) != null){
                    resultado += linhaArquivo+"\n";
                }

                arquivo.close();
            }
        }catch (IOException e){
            Log.v("MainActivity", e.toString());
        }

        return resultado;
    }

}
