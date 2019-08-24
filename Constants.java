package mypack;

public class Constants {
  static final String STR = "string";
  static final int COUNT1 = 1;
  static final int COUNT2 = 1;

  public int bar() {
    return COUNT1;
  }

  public int baz() {
    return COUNT2;
  }

}

class Color {
  private int r;
  private int g;
  private int b;
  private Color(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }
  public static final Color RED = new Color(1,0,0);
  public static final Color GREEN = new Color(0,1,0);
  public static final Color GREEN1 = new Color(0,1,0);
  public static final Color BLUE = new Color(0,0,1);
}
