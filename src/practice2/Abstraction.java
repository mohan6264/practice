package practice2;
abstract class Animal {
public abstract void makeSound();
public void sleep() {
 System.out.println("Zzz");
}
}
class Dog extends Animal {
public void makeSound() {
 System.out.println("Woof");
}
}
class Main {
public static void main(String[] args) {
 Dog myDog = new Dog();
 myDog.makeSound();
 myDog.sleep();
}
}
