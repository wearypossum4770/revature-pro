package org.example.gitlabs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT change anything within this test file. All code should be written in
 * src/main/java/Lab.java
 */
public class HelloWorldTest {
  HelloWorldLab hw = new HelloWorldLab();

  /**
   * Method sayHello() must return "Hello, World!". The trim method will remove any extra spaces or
   * newlines at the end.
   */
  @Test
  public void helloTest() {
    String expected = "Hello, world!";
    String actual = hw.sayHello().trim();
    assertEquals(expected, actual);
  }
}
