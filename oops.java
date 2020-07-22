package oopss;
interface Students          //interface usage
{
    abstract void section();      //abstract method
    abstract int get_rollno();    //abstract method
    abstract String get_name();  //abstract method
}
class Student implements Students
{
    private int rollno=1; 
    private String name="Bhuvanesh"; //encapsulation 
    public void section()        //overriding method (polymorphism)
    {
        System.out.println("Section B");
    }
    public int get_rollno()
    {
        return rollno;
    }
    public String get_name()
    {
        return name;
    }
}
class OverridingClass extends Student 
{
    public void section()
    {
     System.out.println("overriding am section B");   
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	 Students s=new OverridingClass();
	 s.section();
	 System.out.println("roll no. "+s.get_rollno());
	 System.out.println("name "+s.get_name());
	 
	}
}