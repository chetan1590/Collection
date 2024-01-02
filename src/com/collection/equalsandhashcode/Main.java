import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        Employee a = new Employee(1, "A", 10);
        Employee b = new Employee(2, "B", 20);
        Employee c = new Employee(1, "A", 10);
        Employee d = new Employee(4, "D", 40);
        Employee e = new Employee(5, "E", 50);
        Employee f = new Employee(6, "F", 60);

        //Maintain insertion order
        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(d);
        list1.add(b);
        list1.add(c);
        list1.add(a);
        list1.add(e);
        list1.add(f);
        System.out.println("List 1 " + list1);

        //Maintain insertion order
        List<Employee> list2 = new LinkedList<Employee>();
        list2.add(d);
        list2.add(b);
        list2.add(c);
        list2.add(a);
        list2.add(e);
        list2.add(f);
        System.out.println("List 2 " + list2);

        //Not Maintain insertion order & Remove duplication
        Set<Employee> set1 = new HashSet<Employee>();
        set1.add(d);
        set1.add(b);
        set1.add(c);
        set1.add(a);
        set1.add(e);
        set1.add(f);
        System.out.println("Set 1 " + set1);

        //Maintain insertion order & Remove duplication
        Set<Employee> set2 = new LinkedHashSet<Employee>();
        set2.add(d);
        set2.add(b);
        set2.add(c);
        set2.add(a);
        set2.add(e);
        set2.add(f);
        System.out.println("Set 2 " + set2);

        Set<Employee> set3 = new TreeSet<Employee>();
        set3.add(d);
        set3.add(b);
        set3.add(c);
        set3.add(a);
        set3.add(e);
        set3.add(f);
        System.out.println("Set 3 " + set3);

        //Not Maintain insertion order but remove duplication because of hashcode() & equals() implementation in custom key class.
        Map<Employee, Integer> map1 = new HashMap<Employee, Integer>();
        map1.put(d, 1);
        map1.put(b, 2);
        map1.put(c, 3);
        map1.put(a, 4);
        map1.put(e, 5);
        map1.put(f, 6);
        System.out.println("Map 1 " + map1);

        //Maintain insertion order but remove duplication because of hashcode() & equals() implementation in custom key class.
        Map<Employee, Integer> map2 = new LinkedHashMap<Employee, Integer>();
        map2.put(d, 1);
        map2.put(b, 2);
        map2.put(c, 3);
        map2.put(a, 4);
        map2.put(e, 5);
        map2.put(f, 6);
        System.out.println("Map 2 " + map2);

        Map<Employee, Integer> map3 = new TreeMap<Employee, Integer>();
        map3.put(d, 1);
        map3.put(b, 2);
        map3.put(c, 3);
        map3.put(a, 4);
        map3.put(e, 5);
        map3.put(f, 6);
        System.out.println("Map 3 " + map3);
        
    }
}


class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //ascending order & keep only one if condition & return;
        if(this.id < o.id){
            return 1;
        }
        //descending order
        else if(this.id > o.id){
            return -1;
        }
        return 0;
    }
}
