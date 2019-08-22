package co.meri.ca;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
          } catch (Exception e) {
            e.printStackTrace(System.out);
          }
    }
}
