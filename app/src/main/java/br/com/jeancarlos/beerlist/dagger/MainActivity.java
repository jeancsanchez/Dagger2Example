package br.com.jeancarlos.beerlist.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import br.com.jeancarlos.beerlist.dagger.components.DaggerPessoaComponent;


public class MainActivity extends AppCompatActivity {

    @Inject
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerPessoaComponent
                .builder()
                .build()
                .Inject(this);


        pessoa.getCar().setPlaca("hihi");
        pessoa.setName("Jean");

        Toast.makeText(this, pessoa.getName() + " - " + pessoa.getCar().getPlaca(), Toast.LENGTH_LONG).show();
    }
}
