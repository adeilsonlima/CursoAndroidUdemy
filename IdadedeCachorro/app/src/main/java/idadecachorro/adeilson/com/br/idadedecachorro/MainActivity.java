package idadecachorro.adeilson.com.br.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextIdade);
        button = (Button) findViewById(R.id.btnDescIdade);
        textView = (TextView) findViewById(R.id.textViewIdade);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idadeString = editText.getText().toString();

                if(!idadeString.isEmpty()){
                    int idadeInt = Integer.parseInt(idadeString);
                    textView.setText("A idade do cachorro em anos humanos é: "+idadeInt*7);
                }
                else{
                    textView.setText("Por favor, digite um valor numérico");
                }

            }
        });
    }
}
