//Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

public class encapsulation{
    private int age =11;
    private String name="Shree";
    public String getName(){
        return name;
    }
    public void setName(String a){
        name=a;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int b){
        age=b;
    }
}
public class encapsulationMethod{
    public static void main(String args[]){
        encapsulation obj = new encapsulation();
        obj.s
        System.out.println(obj.setName());
    }
}