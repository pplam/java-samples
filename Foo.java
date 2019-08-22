package mypack;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Foo {
  public int bar() {
    static final int COUNT = 1;
    return COUNT;
  }

  public int baz() {
    static final int COUNT = 2;
    COUNT++;
    return COUNT;
  }

  public int bas() {
    int ret = 0;
    try {
      int[] arr = {1, 2, 3};
      ret = arr[3];
    } catch (Exception e) {
      System.out.println(e.printStackTrace());
    } finally {
      return ret;
    }
  }

  public void bass() {
    try (Scanner scanner = new Scanner(new File("test.txt"))) {
    while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
    }
    } catch (FileNotFoundException fnfe) {
        fnfe.printStackTrace();
    }
  }

  public static void main(String args[]){
    File file=new File("test.txt");
    System.out.println(file.exists());
    bass();
  }
}
