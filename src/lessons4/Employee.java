package lessons4;

public class Employee {
    protected String fullName;
    protected String position;
    protected String phoneNumber;
    protected int wages;
    protected int age;

    public String toString(){
        return String.format("Имя: %s \nДолжность: %s \nТел: %s \nЗарплата: %d \nВозраст: %d \n",
                fullName, position, phoneNumber, wages, age);}

    public void print(){
        System.out.println(this);
    }

    public Employee(String fullName, String position, String phoneNumber, int wages, int age){
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
  }


}

