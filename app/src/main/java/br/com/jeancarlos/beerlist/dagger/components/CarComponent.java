package br.com.jeancarlos.beerlist.dagger.components;

import br.com.jeancarlos.beerlist.dagger.Pessoa;
import br.com.jeancarlos.beerlist.dagger.modules.CarModule;
import dagger.Component;

/**
 * @author Jean Carlos
 * @since 01/06/17
 */


@Component(modules = {CarModule.class})
public interface CarComponent {

    void Inject(Pessoa pessoa);
}
