public class MultipleInheritanceUsingInterfaces {
  interface Flyable {
    void fly();
  }

  interface Swimmable {
    void swim();
  }

  class FlyingFish implements Flyable, Swimmable {
    public void fly() {
      System.out.println("Flying fish can glide in the air.");
    }

    public void swim() {
      System.out.println("Flying fish can swim underwater.");
    }
  }

  public static void main(String[] args) {
    MultipleInheritanceUsingInterfaces outerInstance = new MultipleInheritanceUsingInterfaces();
    FlyingFish flyingFish = outerInstance.new FlyingFish();
    flyingFish.fly();
    flyingFish.swim();
  }
}
