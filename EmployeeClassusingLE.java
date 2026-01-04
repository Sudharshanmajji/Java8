import java.util.*;
class Employee{
    String name;
    int eno;

    Employee(String name,int eno)
    {
        this.name=name;
        this.eno=eno;
    }
    public String toString()
    {
        return eno + ":" + name;
    }

}
public class EmployeeClassusingLE {
    public static void main(String[] args) {
        List<Employee> l=new ArrayList<Employee>();
        l.add(new Employee("Durga",1234));
        l.add(new Employee("Chinni",4578));
        l.add(new Employee("Bunny",4567));
        l.add(new Employee("Sudheer",7689));
        System.out.println(l);
        l.sort((a,b)-> b.eno-a.eno);
        System.out.println("After sorting in desc: " +l);
        l.sort((a,b)->a.name.compareTo(b.name));
        System.out.println("After arranging according to alphabet order : " +l);

    }

}
