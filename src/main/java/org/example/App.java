package org.example;

public class App {
  public static final String[] CITIES= {"Cairo", "Damascus", "London", "Paris", "Rome", "Teheran"};

  public static void main(String[] args) {
    System.out.println(lookupCity(6));
  }

  public static String lookupCity(int n) {
    return CITIES[n];
  }
}