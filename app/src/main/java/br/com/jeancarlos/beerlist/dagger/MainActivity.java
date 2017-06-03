package br.com.jeancarlos.beerlist.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.jeancarlos.beerlist.dagger.components.DaggerPessoaComponent;


@SuppressWarnings("SpellCheckingInspection")
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private RecyclerAdapter mAdapter;

    @Inject
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        initInjections();
        createAdapter();
        mAdapter.setupItems(createListPessoas());
    }

    private void initInjections() {
        DaggerPessoaComponent
                .builder()
                .build()
                .Inject(this);
    }

    private void createAdapter() {
        mAdapter = new RecyclerAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<Pessoa> createListPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoa.getCar().setPlaca("hihi");
        pessoa.setName("Jean");
        pessoas.add(pessoa);
        return pessoas;
    }
}
