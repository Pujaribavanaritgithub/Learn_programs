package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	
		List<Employee> emps = Arrays.asList(
				new Employee(1,"Bavana",26,"Female",2024,"Development",60000.00),
				new Employee(2,"Radha",29,"Female",2021,"HR",10000.00),
				new Employee(3,"Krishna",31,"Male",2000,"Infrastructure",30000.00),
				new Employee(4,"Ratheesh",28,"Male",1998,"Testing",40000.00),
				new Employee(5,"Madhav",24,"Male",2004,"Sales",70000.00),
				new Employee(6,"Kishore",46,"Male",2006,"HR",60000.00),
				new Employee(7,"Kishori",35,"Female",1998,"Infrastructure",40000.00),
				new Employee(8,"Madhavi",16,"Female",2014,"Security",30000.00),
				new Employee(9,"Baby",18,"Female",1997,"Testing",80000.00),
				new Employee(10,"Darling",15,"Female",2014,"Infrastructure",90000.00),
				new Employee(11,"Dude",19,"Male",1999,"Finance",50000.00),
				new Employee(12,"Gouri",33,"Female",2012,"HR",50000.00),
				new Employee(13,"Shiv",32,"Male",1996,"Testing",20000.00)
				);
		
		// How many many male and female Employees are there in organization
		 Map<String, Long> m1 = emps.stream()
				                    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
        System.out.println(m1);
        
        //Print the all department names in the Organization
        
        emps.stream()
             .map(emp-> emp.getDept())
             .distinct()
             .forEach(n-> System.out.println(n));
        
        //Print the average Age of male and female employees
        
        Map<String, Double> m2 = emps.stream()
        .collect(Collectors
        		.groupingBy(Employee::getGender, 
        				Collectors.averagingInt(Employee::getAge)));
        
        System.out.println(m2);
        
        // Get the details of highest paid employee in the Organization
        
        Employee m3 = emps.stream()
        		.max(Comparator.comparing(Employee::getSalary)).get();
        
        //approach-2
        
        Optional<Employee> collect = emps.stream()
        .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        
        if(collect.isPresent()) {
        	System.out.println(collect);
        }
        System.out.println(m3);
        
        // Get the details of Employess who jined after 2015
        
        emps.stream()
            .filter(e->e.getYearOfJoining()>2015)
            .map(e->e.getName())
            .forEach(e-> System.out.println(e));
        
        //Count the number of employees in each department
        
        Map<String, Long> m4 = emps.stream()
        		.collect(Collectors.groupingBy(
        				Employee::getDept, Collectors.counting()));
        
        System.out.println(m4);
        
        // What is the average salary of each department
        
        Map<String, Double> m5 = emps.stream()
        		                 .collect(Collectors.groupingBy(
        		                		 Employee::getDept, Collectors.averagingDouble
        		                		 (Employee::getSalary)));
        System.out.println(m5);
        
        // Get the youngest Male employee details of the Testing team
        
        Optional<Employee> min = emps.stream()
            .filter(e-> e.getGender().equals("Male") && e.getDept().equals("Testing"))
            .min(Comparator.comparing(Employee::getAge));   
        
        if(min.isPresent()) {
        	System.out.println(min.get()); 	
        }
        
        // Who has the most working experience person in the organization
        
        Optional<Employee> min2 = emps.stream()
        		                      .min(Comparator.comparing(Employee::getYearOfJoining));
        
        if(min2.isPresent())
        	System.out.println("most experienced::" +min2.get());
        
        // How many male and female employees are there in the testing team
        
        Map<String, Long> m6 = emps.stream().filter(e -> e.getDept().equals("Testing"))
        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        
        System.out.println(m6);
        
        // What is average salary of male and female employees
        
        Map<String, Double> avg = emps.stream()
        	   .collect(Collectors.groupingBy(Employee:: getGender,
        				Collectors.averagingDouble(Employee::getSalary)));
        
        System.out.println(avg);
        
        //List down the employees in each department
        
        Map<String, List<Employee>> list = emps.stream()
        		.collect(Collectors.groupingBy(Employee:: getDept, 
        				Collectors.toList()));
        System.out.println(list);
        
        // Second hignest salary
        Employee secondhigh = emps.stream()
        		                  .sorted(Comparator.comparing(Employee:: getSalary).reversed())
        		                  .skip(1)
        		                  .findFirst()
        		                  .get();
        System.out.println("Second : " + secondhigh);
        
        
        
        
        
        
        
        
	}

}
