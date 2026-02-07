public class oop2 {
  public static void main(String[] args) {
    dog lisa=new dog();
    lisa.sound();
    lisa.color();
  }

  
}

abstract class Animal{
  public abstract void sound();
  public abstract void color();

}

class dog extends Animal{
  public void sound(){
    System.out.println("bark");
  }
  public void color(){
    System.out.println("golden");
  }
}
