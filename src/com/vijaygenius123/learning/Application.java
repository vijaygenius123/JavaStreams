package com.vijaygenius123.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        System.out.println("Starting");

        List<Employee> employees = new ArrayList<>();

        Employee jasmine = new Employee(1,
                "Jasmine",
                "jasmine@gmail.com",
                Department.ENGINEERING,
                List.of(new Asset("Macbook Pro 16", Type.LAPTOP))
        );
        employees.add(jasmine);

        Employee marcus = new Employee(2,
                "Marcus",
                "marcus@gmail.com",
                Department.MARKETING,
                List.of(new Asset("Macbook Air", Type.LAPTOP), new Asset("LG 26'", Type.MONITOR))
        );
        employees.add(marcus);

        Employee tony = new Employee(3,
                "Tony",
                "tony@gmail.com",
                Department.ENGINEERING,
                List.of(new Asset("Macbook Pro 16", Type.LAPTOP))
        );
        employees.add(tony);


        System.out.println("All Employees");
        System.out.println(employees);



        System.out.println("MARKETING Employees");
        employees.stream()
                .filter(employee -> employee.getDepartment().equals(Department.MARKETING))
                .forEach(System.out::println);

        //System.out.println("Sales Employees");
        //System.out.println(filteredEmployeesStream);

    }
}
