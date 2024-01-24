package com.myblog.myblog11;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.myblog.myblog11.LoginDto;
import com.myblog.myblog11.Login;

public class TestClass1 {

//    public static void main(String[] args) {
//        Predicate<Integer> val = x->x%2==0;
//        boolean result = val.test(10);
//        System.out.println(result);
//    }

//    public static void main(String[] args) {
//        Predicate<String> val = str->str.equals("mike");
//        boolean result = val.test("stalin");
//        System.out.println(result);
//    }

//    // Filter only even numbers
//    // Stream() it fetches the contents of data structure 1 by 1 just like a pipe which helps for filtering/sorting etc
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 20, 1, 5, 16, 19, 20);
//        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);
//    }

//    // Filter only odd numbers
//    // Stream() it fetches the contents of data structure 1 by 1 just like a pipe which helps for filtering/sorting etc
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 20, 1, 5, 16, 19, 20);
//        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);
//    }

//    // Filter only names starting with letter "a" and how many times mike has repeated in collection
//    // Stream() it fetches the contents of data structure 1 by 1 just like a pipe which helps for filtering/sorting etc
//    public static void main(String[] args) {
//        List<String > names = Arrays.asList("mike","adam","mike","stallin");
//        List<String> match = names.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());
//        List<String> match2 = names.stream().filter(n -> n.equals("mike")).collect(Collectors.toList());
//        System.out.println(match);
//        System.out.println(match2);
//    }

//    // Convert all the names to upper case
//    public static void main(String[] args) {
//        List<String > data = Arrays.asList("mike","adam","mike","stallin");
//        data.stream().map
//    }

//    // get length of the string
//    public static void main(String[] args) {
//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);
//    }

//    // add 2 numbers
//    public static void main(String[] args) {
//        Function<Integer,Integer> result = i->i+10;
//        Integer val = result.apply(30);
//        System.out.println(val);
//    }

//    // add 10 to array list of number
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10,20,30,60,90);
//        List<Integer> newNumbers = data.stream().map(i -> i +10).collect(Collectors.toList());
//        System.out.println(newNumbers);
//    }

//    // convert string to upper case
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike","stallin","adam");
//        List<String> newdata = data.stream().map(str -> str.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
//        System.out.println(newdata);
//    }

//    // sort the array list of string
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike","stallin","adam");
//        List<String> newdata = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);
//    }

//    // sort the array list of numbers
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(15,3,60,100,1);
//        List<Integer> newdata = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);
//    }

//    // sort the array list of numbers and remove duplicate entries
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(15,3,3,60,100,100,1,1);
//        List<Integer> newdata = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newdata);
//    }

//    // Consumer Functional Interface Example
//    public static void main(String[] args) {
//        Consumer<Integer>result = number-> System.out.println(number);
//        result.accept(100);
//    }

//    // Consumer example for array with string
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("mike","stalling","adan");
//        Consumer<String> nameList = name-> System.out.println(name);
//        names.forEach(nameList);
//    }

//    // Supplier Functional Interface
//    public static void main(String[] args) {
//        // Define a supplier to generate random numbers
//        Supplier<Integer> x = ()->new Random().nextInt(100);
//        Integer y = x.get();
//        System.out.println(y);
//    }
//    public static void main(String[] args) {
//        List<Login> logins = Arrays.asList(new Login("mike","testing"),
//                                           new Login("stallin","testing"),
//                                           new Login("adam","testing")
//        );
//        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
//        System.out.println(dtos);
//    }
//     static LoginDto mapToDto(Login login){
//        LoginDto dto = new LoginDto();
//        dto.setUserName(login.getUserName());
//        dto.setPassword(login.getPassword());
//        return dto;
//    }


//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(new Employee("mike", 30, "chennai"),
//                                                new Employee("adam", 25, "chennai"),
//                                                new Employee("stallin", 31, "pune"),
//                                                new Employee("sam", 34, "bangalore")
//        );
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//        for (Employee e:emps){
//            System.out.println(e.getName());
//            System.out.println(e.getCity());
//            System.out.println(e.getAge());
//        }
//    }

//    //Filter Even number and Generate square of that
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10,12,6,5,7,8,9);
//        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
//        System.out.println(data);
//    }


    //Group By
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("mike", 30, "chennai"),
                new Employee("adam", 25, "chennai"),
                new Employee("stallin", 34, "pune"),
                new Employee("sam", 34, "bangalore")
        );
        Map<String, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        for (Map.Entry<Integer, List<Employee>> entry : collect.entrySet()) {
            int age = entry.getKey();
            List<Employee> employeesWithAge = entry.getValue();
            System.out.println("age:" + age + "---");
            for (Employee e : employeesWithAge) {
                System.out.println(e.getName());
                System.out.println(e.getCity());
            }
        }

        for (Map.Entry<String, List<Employee>> entry : collect1.entrySet()) {
            String city = entry.getKey();
            List<Employee> employeesWithAge = entry.getValue();
            System.out.println("city:" + city + "---");
            for (Employee e : employeesWithAge) {
                System.out.println(e.getName());
                System.out.println(e.getAge());
            }
        }
    }

}
