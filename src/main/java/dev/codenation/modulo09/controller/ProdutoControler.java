package dev.codenation.modulo09.controller;

import dev.codenation.modulo09.config.Modulo09Config;
import dev.codenation.modulo09.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoControler {

    @Autowired
    private Modulo09Config config;

    @GetMapping("/config")
    public String getConfig() {
        return config.getGithubToken();
    }

    @GetMapping("/products")
    public List<Produto> get() {
        return new ArrayList<>();
    }

}
