package br.com.jeancarlos.beerlist.dagger;

import javax.inject.Inject;

import br.com.jeancarlos.beerlist.dagger.components.DaggerCarComponent;

/**
 * @author Jean Carlos
 * @since 01/06/17
 */

public class Pessoa {
    private String name;

    @Inject
    Car car;

    @Inject
    public Pessoa() {
        DaggerCarComponent
                .builder()
                .build()
                .Inject(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}
