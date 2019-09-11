public class Bar {
  public void foo() {
    try {
      System.out.println(1/0);
    } catch (Exception e) {
      e.printStackTrace(System.out);
    }
  }

  public void bar() {
    try {
      System.out.println(1/0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void baz() {
    Integer a = 1;
    Integer b = 0;
    try {
      System.out.println(a/b);
    } catch (Exception e) {
      for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
          System.out.println(ste);
      }
    }
  }
}
