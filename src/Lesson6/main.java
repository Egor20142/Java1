package Lesson6;

public class main {
    public static void main(String[] args){
System.out.println("Cat");
Animal iosiv = new Cat(200, 2, 1);
iosiv.run(1000);
iosiv.jump(500);
 iosiv.swim(0);

 System.out.println("Dog");
 Animal katya = new Dog(500,20,10);
katya.run(499);
katya.jump(19);
katya.swim(9);
    }
}
