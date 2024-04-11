package classAndObjects;

public class classExample1 {

  /*
   * We can  define two main method but the only thing need to
   * consider is that they both have different
   * method signature : methodName and parameters */
  public static void main(String[] args) {
    System.out.println("Main method with String args");
    main(new int[0]);
  }

  public static void main(int[] args) {
    System.out.println("Main method with Integer args");
    // main(new String[0]);
  }


}
