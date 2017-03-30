package br.com.adeilson.qualserie;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imageExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imageExibicao = (ImageView) findViewById(R.id.imagemExibicaoId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress){
                    case 1:
                        imageExibicao.setImageResource(R.drawable.pouco);
                        break;
                    case 2:
                        imageExibicao.setImageResource(R.drawable.medio);
                        break;
                    case 3:
                        imageExibicao.setImageResource(R.drawable.muito);
                        break;
                    case 4:
                        imageExibicao.setImageResource(R.drawable.susto);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
