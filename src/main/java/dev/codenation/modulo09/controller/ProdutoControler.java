package dev.codenation.modulo09.controller;

import dev.codenation.modulo09.config.Modulo09Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControler {

    @Autowired
    private Modulo09Config config;

    @GetMapping("/config")
    public String getConfig() {
        return config.getGithubToken();
    }

}
