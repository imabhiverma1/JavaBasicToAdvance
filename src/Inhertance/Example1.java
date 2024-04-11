package Inhertance;

public class Example1 {

  public static void main(String[] args) {
    parent object1 = new child();
    object1.hello();

  }

  public static class parent {

    private int a = 1;
    protected int b = 2;
    public int c = 3;
    int d = 4;

    static {
      System.out.println("Class parent SIB");
    }

    {
      System.out.println("Class parent IIB");
    }

    parent(int i) {
      System.out.println("parent class constructor");
    }

    void hello() {
      System.out.println("hello from parent");
    }

  }

  public static class child extends parent {

    int b = 6;

    child() {
      super(5);
      System.out.println("calling constructor of child");
    }

    @Override
    void hello() {
      super.hello();
      System.out.println("hello from child");
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
    }
  }

}