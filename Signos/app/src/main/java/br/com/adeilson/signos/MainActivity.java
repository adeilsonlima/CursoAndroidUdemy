package br.com.adeilson.signos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listView;
    private String[] signos = {"Áries","Touro","Gêmeos","Câncer","Leão","Virgem","Libra","Escorpião","Sagitário","Capricórnio","Aquário","Peixes"};
    private String[] significado = {"Os arianos ainda estão se recuperando do último eclipse que ocorreu ao final do mês anterior, por isso é preciso ter um pouco de paciência no início deste mês pois a poeira ainda estará… ",
            "Os taurinos, felizmente ou não, não devem encontrar muitas surpresas e mudanças no gerenciamento de suas vidas neste novo mês. O poder planetário segue a configuração do mês…",
            "É hora de ver quais os geminianos que prestaram atenção nos sinais do cosmos e souberam utilizar os atrasos do último mês a seu favor. No mês anterior, muitos geminianos utilizaram a… ",
            "Bom como já era de se esperar com a maioria de seus planetas na parte superior do horizonte e sua décima Casa da Carreira poderosa, o amor não está em seu melhor momento para… ",
            "As notícias não são exatamente ruins para o amor leonino, mas também não são as melhores possíveis. Isso por que a carreira desse rei das selvas está em um de seus momentos mais…",
            "A primeira notícia importante para a vida amorosa e pessoal do virginiano é o fato do poder planetário estar finalmente se acumulando na metade superior de seu mapa. Essas mudanças…",
            "Os librianos estão em uma situação muito interessante este mês, onde os setores externos e práticos de sua vida vêm crescendo e ganhando força, ao mesmo tempo em que a vida interna…",
            "Por mais que isso incomode muitos escorpiões, a organização planetária continua concentrando suas forças no setor Oeste do horóscopo, desse modo a independência está um…",
            "A vida do sagitariano deve orbitar em torno de sua família e dos aspectos emocionais de sua vida agora. O cosmos providenciou um arranjo planetário que permita até mesmo que a… ",
            "Os capricornianos encaram agora alguns eventos inusitados em suas vidas e diversas situações interessantes. Boa parte da responsabilidade por estes eventos está sobre os ombros de… ",
            "Os aquarianos agora têm um ótimo terreno para trabalhar os assuntos internos, como a família, o lar e o amor. Tudo conspira no universo para que essas áreas recebam muita atenção… ",
            "Com ambos os seus planetas da carreira em movimento de retrogradação, o poder planetário estará na parte inferior do horizonte. Com isso, o pisciano poderá mudar a ênfase de seus… "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
                );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),significado[position],Toast.LENGTH_LONG).show();
            }
        });


    }
}
