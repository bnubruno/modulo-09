package dev.codenation.modulo09.config;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class Modulo09ConfigTest {

    public static final String GITHUB_TOKEN = "githubTokenTest";

    @Autowired
    private Modulo09Config config;

    @Test
    public void whenModulo09ConfigLoad() {
        assertThat(config.getGithubToken(), equalTo(GITHUB_TOKEN));
        assertThat(config.isUseDefaultAlgumaCoisa(), is(true));
    }

}
