public class Vehicle {
  public static void main(String[] args) {
      royal_enfeild gt=new royal_enfeild();
      gt.speed();
      gt.color();
  }
  
}


//its not an abstract class 
class bike {
  public  void speed(){   //thats why we opened and closed the brackets

  }
  public  void color(){

  }
}

class royal_enfeild extends bike{
  public void speed(){
    System.out.println("100 kmph  ");
  }

  public void color(){
    System.out.println("black");
  }

}

