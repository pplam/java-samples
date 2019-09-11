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
}
