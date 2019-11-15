package com.mkyong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.mitienda.spring.Categorias;
import com.mitienda.spring.repositories.CategoriasRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CategoriasRepository repository;

    @Test
    public void testFindByName() {

        entityManager.persist(new Categorias("C++"));

        List<Categorias> books = repository.findByName("C++");
        assertEquals(1, books.size());

        assertThat(books).extracting(Categorias::getName).containsOnly("C++");

    }

}
