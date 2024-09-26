public class inheritance {
 public static void main(String[] args) 
 {
    AddCalc obj = new AddCalc();
    int r1 = obj.add(4, 5);
    int r2 = obj.mul(5, 8);
    int r3 = obj.sub(4, 5);
    int r4 = obj.div(4, 5);
    System.out.println(r1+" "+r2+ " " +r3+" "+r4);
 }
}