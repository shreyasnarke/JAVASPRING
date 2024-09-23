//Encapsulation in Java is a process of wrapping code and data together into a single unit, 
//for example, a capsule which is mixed of several medicines.
class encapsulation{
    private int age;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class encapsulationMethod{
    public static void main(String args[]){
        encapsulation obj = new encapsulation();
        obj.setAge(30);
        obj.setName("Shree");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}