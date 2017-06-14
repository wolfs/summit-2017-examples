package com.example.application;

import com.example.build.info.BuildInfo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new BuildInfo().toString());
    }
}
