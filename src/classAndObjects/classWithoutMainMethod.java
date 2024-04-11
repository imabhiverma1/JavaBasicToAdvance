package classAndObjects;

public class classWithoutMainMethod {

  static {
    System.out.println("Run inside static initialization block ");
  }

  public static void execute() {
    System.out.println("hello");
  }

}
