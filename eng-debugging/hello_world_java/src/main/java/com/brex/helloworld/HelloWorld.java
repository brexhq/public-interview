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
import java.util.Set;
import java.util.stream.Collectors;

public class HelloWorld {
    private final String filePath;
    private final static  Map<String, Boolean> blockedPath = Map.ofEntries(
            Map.entry("/yo", true),
            Map.entry("/what", false)
    );

    private final static Set<String> blockedUsers = List.of("user1", "user2").stream().collect(Collectors.toSet());

    HelloWorld(String filePath) {
        this.filePath = filePath;
    }

    public String loadFile() throws IOException {
        URL file = this.getClass().getClassLoader().getResource(filePath);
        String path = new File(file.getPath()).getAbsolutePath();
        if (path.isBlank()) {
            throw new IOException("empty path");
        }

        if (blockedPath.containsKey(path)) {
            throw new IOException("path is not accessible");
        }
        return new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
    }

    public String run(String user) throws IOException {
        if (blockedUsers.contains(user)) {
            throw new IOException("user not allowed");
        }
        String contents = loadFile();
        System.out.println("running at" +  LocalDate.now());
        // To fix test case 2, change the line below.
        return contents.replace('_', ' ');
    }
}
