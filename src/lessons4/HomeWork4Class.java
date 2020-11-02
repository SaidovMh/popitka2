package lessons4;

public class HomeWork4Class {

    public static void main(String[] args) {

            Employee[] dasie = new Employee[5];
            dasie[0] = new Employee("Андрей", "Менеджер", "79990899909", 150000, 24);
            dasie[1] = new Employee("Олег", "Младший менеджер", "+79635222154", 10000, 30);
            dasie[2] = new Employee("Саша", "Уборшик", "+79632589465", 25000, 45);
            dasie[3] = new Employee("Владимер", "Курьер", "+79886546565", 45000, 40);
            dasie[4] = new Employee("Марина", "Секретарь", "+79899699595", 35000, 27);

        for (int i=0; i < dasie.length; i++)
            if (dasie[i].age >= 40) {
                System.out.println("+ к зарплате данного сотрудников 5000 руб. за возрост:");
                System.out.println();
                dasie[i].print();
            }



    }
}

