package JavaOOPS;
class A{
    public void m1(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void m1(){
        System.out.println("Class B");
    }
}
public class Main {
    public static void main(String[] args) {
     //   B obj2 = new A(); // this will give us compiletime error
        
     // this will give a type mismatch error
     
     A ai = new B(); // this is called upcasting
     ai.m1(); // this will call the method of class B because of runtime polymorphism
      
    }
}
