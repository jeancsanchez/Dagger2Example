package br.com.jeancarlos.beerlist.dagger.modules;

import br.com.jeancarlos.beerlist.dagger.Pessoa;
import dagger.Module;
import dagger.Provides;

/**
 * @author Jean Carlos
 * @since 01/06/17
 */

@Module
public class PessoaModule {

    @Provides
    Pessoa providesPessoa() {
        return new Pessoa();
    }
}
