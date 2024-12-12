public class Worker {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;
    public Worker (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
    public void cardOfWorker () {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
