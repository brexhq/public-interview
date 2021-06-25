package com.brex.helloworld;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class HelloWorld {
    private final String filePath;

    HelloWorld(String filePath) {
        this.filePath = filePath;
    }

    public String loadFile() throws IOException {
        URL file = this.getClass().getClassLoader().getResource(filePath);
        String path = new File(file.getPath()).getAbsolutePath();
        return new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
    }

    public String run() throws IOException {
        String contents = loadFile();
        // To fix test case 2, change the line below.
        return contents.replace('_', ' ');
    }
}
