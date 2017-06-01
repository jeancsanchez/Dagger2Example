package br.com.jeancarlos.beerlist.dagger.modules;

import br.com.jeancarlos.beerlist.dagger.Car;
import dagger.Module;
import dagger.Provides;

/**
 * @author Jean Carlos
 * @since 01/06/17
 */

@Module
public class CarModule {

    @Provides
    Car providesCar() {
        return new Car();
    }
}
