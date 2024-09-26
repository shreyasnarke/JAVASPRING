class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("in A show");
    }
}
public class anonymousObject{
    public static void main(String a[]){
        A obj = new A();
        obj.show();
    }
}