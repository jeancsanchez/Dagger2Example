package br.com.jeancarlos.beerlist.dagger;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {


    @Test
    public void add_a_name_for_a_pessoa() throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Jean");

        assertEquals(pessoa.getName(), "Jean");
    }

    @Test
    public void add_a_car_for_a_pessoa() throws Exception {

    }
}