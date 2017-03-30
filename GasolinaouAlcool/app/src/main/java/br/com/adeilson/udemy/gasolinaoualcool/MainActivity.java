package br.com.adeilson.udemy.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText precoGasolina;
    private EditText precoAlcool;
    private Button botaoVerificar;
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoGasolina = (EditText)findViewById(R.id.precoGasolinaId);
        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        botaoVerificar =(Button) findViewById(R.id.botaoVerificarId);
        textViewMsg = (TextView) findViewById(R.id.textViewMsgId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoPrecoGasolina = precoGasolina.getText().toString();
                String textoPrecoAlcool = precoAlcool.getText().toString();

                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);

                Double resultado = valorAlcool/valorGasolina;

                if (resultado>=0.7){
                    textViewMsg.setText("É melhor utilizar Gasolina");
                }
                else{
                    textViewMsg.setText("É melhor utilizar Álcool");
                }

                Toast.makeText(getApplicationContext(),"Obrigado", Toast.LENGTH_LONG).show();
            }
        });
    }
}
