package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

  public static void main(String[] args) {
    iCallAndHandle();
//    System.out.println(stringMethodIgnoringException());
//    System.out.println(stringMethodIgnoringReturn());
//    System.out.println(printMethod());
  }

  public static void iCallAndHandle() {
    try {
      iDoSomething();
      System.out.println("If get this printed, something is wrong! We should not get this executed!");

    } catch (FileNotFoundException e) { // this handler is not "appropriate" for IOException
      System.out.println("I caught and handled FileNotFoundException: " + e.getMessage());
    } catch (IOException e) { // this one is
      System.out.println("I caught and handled IOException: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("I caught and handled Exception: " + e.getMessage());
    } finally {
      System.out.println("This is a finally block");
    }
  }

  public static void iDoSomething() throws IOException {
    iFailSometimes();
  }

  public static void iFailSometimes() throws IOException {
    throw new IOException("This is just an example");
  }

  public static String stringMethodIgnoringException() {
    try {
      System.out.println("Inside try");
      throw new IOException();
    } finally {
      System.out.println("Inside finally");
      return "from finally";
    }
  }

  public static String stringMethodIgnoringReturn() {
    try {
      System.out.println("Inside try");
      return "from try";
    } finally {
      System.out.println("Inside finally");
      return "from finally";
    }
  }

  public static boolean printMethod() {
    PrintWriter writer = null;
    try {
      System.out.println("Inside try block");
//      writer = new PrintWriter(
//          new FileWriter("OutFile.txt"));
//      writer.println("Kilroy was here");
      System.out.println("Returning true from try");
      return true;
    }
//    catch (IOException e) {
//      System.err.println("Error while " +
//          "writing to file");
//    }
    finally {
        writer.close();
    }
//    return false;
  }
}