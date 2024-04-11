package classAndObjects;

public class Example2 {

  /*we can define multiple child class in any class,
   * but it should now be outside the class definition */
  public static void main(String[] args) {

    A a = new A();
    B b = new B();
    A c = new B();

    /*java: incompatible types: classAndObjects.Example2.A
    cannot be converted to classAndObjects.Example2.B*/
    //  B d = new A();

    a.hello();
    b.hello();
    c.hello(); //Method overRiding
    //  d.hello();
  }


  public static class A {

    void hello() {
      System.out.println("calling from class A");
    }
  }

  public static class B extends A {

    void hello() {
      System.out.println("Calling from class B");
    }
  }
}