import java.util.*;
class c1{
    int a,b;
    public void c1(){
        System.out.println("Within Constructor");
    }
    public int c2(int a,int b){
        System.out.println("Sum :");
        return a+b;
    }
}

public class constructor{
    public static void main(String[] args) {
        int a,b;
        c1 objc = new c1();
        c1 obj = new c1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
		a=sc.nextInt();		
		System.out.println("Enter 2nd Number:");
		b=sc.nextInt();
        objc.c1();
        obj.c2(a,b);
    }
}
