package dev.codenation.modulo09.repository;

import dev.codenation.modulo09.entity.Produto;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    @Transactional
    public void whenSaveProduct() {
        Produto produto = Produto.builder()
                .descricao("Banana")
                .build();

        Produto result = produtoRepository.save(produto);

        MatcherAssert.assertThat(result.getId(), notNullValue());
    }

}
