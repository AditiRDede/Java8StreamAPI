// Create employee list and perform stream api operations
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Java 8 Practice");

        List<Employee> emplist=new ArrayList<Employee>();
        emplist.add(new Employee(1,"Aditi",100,"Pune","IT"));
        emplist.add(new Employee(2,"Athira",500,"California","HR"));
        emplist.add(new Employee(3,"Steave",200,"Texas","Physics"));
        emplist.add(new Employee(4,"David",300,"New York","Chemistry"));
        emplist.add(new Employee(5,"Tom",600,"London","Biology"));

      // List<Employee> list= emplist.stream().distinct().collect(Collectors.toList());

        //print all unique elements
        //emplist.stream().distinct().forEach(System.out::println);

        //print the count
        /*Long count =emplist.stream().filter(emp->emp.getName().equals("Aditi")).count();
        System.out.println("Count : "+count);*/

      //  emplist.stream().filter(emp->emp.getSalary()>200).map(emp->emp.getName()).forEach(System.out::println);

        /*emplist.stream().filter(emp->emp.getName().equals("Aditi")).map(emp->emp.getName()
                        .toUpperCase()).forEach(System.out :: println);
*/

        //get all city names of all employees
        /*emplist.stream().map(emp->emp.getCity()).forEach(System.out:: println);*/

        //Get count of employee whos salary is greater than 200
       /* Long count =emplist.stream().filter(emp->emp.getSalary()>200).count();
        System.out.println("Count : "+count);*/

        //get first 3 employee object as a list

        /*emplist.stream().limit(3).forEach(System.out:: println);*/

        //skip first 3 employee and display rest of the collection

       /* emplist.stream().skip(3).forEach(System.out::println);*/

        //findFirst
        Employee eobj=emplist.stream().findFirst().get();
        System.out.println(eobj);

        //Sort salary of employeess
        List<Double> salarylist=emplist.stream().map(emp->emp.getSalary()).sorted().collect(Collectors.toList());
        System.out.println(salarylist);

        //sorting objects based on salaray
      List<Employee> list= emplist.stream().sorted((emp1,emp2)->
                {
                    return (int)(emp2.getSalary()-emp1.getSalary());
                }
                ).skip(1).limit(1).collect(Collectors.toList());

      System.out.println("2nd highest salary");
      System.out.println(list);
      System.out.println("Max salary");

     double maxsalary=emplist.stream().max((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary())).get().getSalary();
     System.out.println("Max salary : "+maxsalary);

     System.out.println("Minimum salary");
     double minsalary=emplist.stream().min((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary())).get().getSalary();
     System.out.println("minimum salary : "+minsalary);

     System.out.println("Average Salary");
     double avgsalary=emplist.stream().mapToDouble(emp->emp.getSalary()).average().getAsDouble();
     System.out.println("average salary :"+avgsalary);




    }
}