import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
public class CollectorOperations
{
    public static void main(String [] args)
    {
        System.out.println("Collector class operations ");
        List<Employee> emplist=new ArrayList<Employee>();
        emplist.add(new Employee(1,"Aditi",100,"Texas","IT"));
        emplist.add(new Employee(2,"Athira",500,"California","HR"));
        emplist.add(new Employee(3,"Steave",200,"Texas","HR"));
        emplist.add(new Employee(4,"David",300,"London","IT"));
        emplist.add(new Employee(5,"Tom",600,"London","Biology"));

        //What is the purpose of collector class
       List<String> names = emplist.stream().filter(emp->emp.getSalary()>100)
        .map(emp->emp.getName()).collect(Collectors.toList());

       System.out.println(names);

       //get unique department names
        List<String> deplist=emplist.stream().map(emp->emp.getDepartment())
                .distinct().collect(Collectors.toList());
        System.out.println("Unique Departments: "+deplist);


        //collect employee ids as key and their salary as value in a map

       Map<Integer,Double> map= emplist.stream()
               .collect(Collectors.toMap(Employee::getEmpid,Employee::getSalary));

       System.out.println("Employee id : salary map");
       System.out.println(map);

       //groupingby
       //get avg salary of all departments

        Map<String,Double> deparmentavgsalary=emplist.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                        ));
        System.out.println("deparmentavgsalary "+deparmentavgsalary);

        //get Avg salary of employee based on city

        Map<String,Double> avgSalaryCityWise=emplist.stream().collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avgSalaryCityWise :"+avgSalaryCityWise);

        //join all columns of city by delimiter :::
       String allcities= emplist.stream().map(emp->emp.getCity()).distinct()
               .collect(Collectors.joining(":::"));
       System.out.println(allcities);

       //summing all salaries
       Double totalSalary= emplist.stream().collect(Collectors.summingDouble(Employee::getSalary));
       System.out.println(totalSalary);


    }
}
