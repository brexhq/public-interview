package com.brex.helloworld;

import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @org.junit.jupiter.api.Test
    void testCase1() throws IOException {
      // This test case is passing
      HelloWorld helloWorld = new HelloWorld("input/test_1.txt");
      String actualOutput = helloWorld.run("user-4");
      assertEquals("hello world\n", actualOutput);
    }
    @org.junit.jupiter.api.Test
    void testCase2() throws IOException {
      // This test case is failing
      HelloWorld helloWorld = new HelloWorld("input/test_2.txt");
      String actualOutput = helloWorld.run("user-5");
      assertEquals("hello-world\n", actualOutput);
    }
}
