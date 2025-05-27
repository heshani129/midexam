import java.util.Scanner;

public class employee {
    private String name;
    private int age;
    private double salary;

    public employee() {
        this.name = "";
        this.age = 0;
        this.salary = 0.0;
    }
    public employee(String name,int age,double salary) {
        this.name =name ;
        this.age = age;
        this.salary =salary;
    }
    public static void main(String[] args) {
        employee employee1=new employee("alex",30,10000);
        employee employee2=new employee("john",32,25000);
        employee employee3=new employee("james",45,40000);
        employee employee4=new employee("william",18,28000);
        employee employee5=new employee("david",21,32000);



        System.out.println("salary for the month of july:");
        System.out.println("===============================");
        System.out.println("employee name age salary");
        System.out.println("===============================");

        System.out.println("employee1.name + \"\\t\\t\" + employee1.age + \"\\t\\t\" + employee1.salary");
        System.out.println(employee2.name + "\t\t" + employee2.age + "\t\t" + employee2.salary);
        System.out.println(employee3.name + "\t\t" + employee3.age + "\t\t" + employee3.salary);
        System.out.println(employee4.name + "\t\t" + employee4.age + "\t\t" + employee4.salary);
        System.out.println(employee5.name + "\t\t" + employee5.age + "\t\t" + employee5.salary);

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        System.out.println("multiplication table for:"+num);
        System.out.println("================");
        for(int i=1;i<=12;i++){
            int result=num*i;
            System.out.println(i+"x"+num+"="+result);
            + 
        }
    }
}