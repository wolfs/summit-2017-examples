package com.example.application;

import org.junit.Test;

import java.io.IOException;

public class ApplicationStartupTest {

    @Test
    public void applicationShouldStartup() throws IOException {
        Main.main(new String[] {});
    }
}
