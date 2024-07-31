class Student1
{
    private int age;
    private String name;
    public void setData()
    {
        age = 18;
        name = "Manas";
    }
    public void show()
    {
        System.out.println(name + " " + age);
    }
}
public class Encapsulationn {
    public static void main(String[] args) 
    {
        Student1 obj = new Student1();
        Student1 obj1 = new Student1();
        obj.setData();
        obj.show();
    }
}
