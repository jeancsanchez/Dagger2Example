package br.com.jeancarlos.beerlist.dagger.components;

import br.com.jeancarlos.beerlist.dagger.MainActivity;
import br.com.jeancarlos.beerlist.dagger.modules.PessoaModule;
import dagger.Component;

/**
 * @author Jean Carlos
 * @since 01/06/17
 */


@Component(modules = {PessoaModule.class})
public interface PessoaComponent {

    void Inject(MainActivity mainActivity);
}
