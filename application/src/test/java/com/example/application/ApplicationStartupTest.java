package com.example.application;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ApplicationStartupTest {

    @Test
    public void applicationShouldStartup() throws IOException {
        Files.list(Paths.get(System.getenv().get("INTEGRATION_TEST_SAMPLES"))).forEach(path ->
                Main.main(new String[]{ path.toString() })
        );
    }
}
