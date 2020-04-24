package ru.ifmo.base.lesson14.hw;

// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплете
// имени, зарплате, возрасту и компании

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Employee {
    private final int[] SALARIES = {20000, 100000}; // зарплата
    private final int[] AGES = {21, 60}; // возраст

    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: конструктор, геттеры и сеттеры


    public Employee(String name, String company, int salary, int age) {
        setName(name);
        setCompany(company);
        setSalary(salary);
        setAge(age);
    }


    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // метод выбирает int из масссива
    public static int randomInt(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    // метод выбирает string из массива
    public static String randomString(String[] array) {
        String rnd1 = String.valueOf(new Random().nextInt(array.length));
        return array[Integer.parseInt(rnd1)];
    }

    // метод для создания списка объектов класса Employee
    public List<Employee> employeeGenerator(int num) {
        // массив с именами
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"};
        // массив с названиями компаний
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"};
        if (num<=0) {
            return Collections.emptyList();
        }

        // добавление num объектов Employee в список (employees)
        List<Employee> employees = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[randomString(names)],
                    companies[randomString(companies)],
                    salary[randomInt(SALARIES)];
                    )); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        return employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return company != null ? company.equals(employee.company) : employee.company == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    /*public void randomInt(Employee employee) {
        int[] SALARIES = {1000, 10000};
        int[] AGES = {21, 60};
        int salary = ((int) Math.random()*((SALARIES[1]-SALARIES[0])+1)+SALARIES[0]);
        int age = ((int)Math.random()*((AGES[1]-AGES[0]))+AGES[0]);
        return SALARIES[], AGES[], salary, age;
    }*/


}
