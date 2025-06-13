package encapsulation;

import encapsulation.basic.Student;
import encapsulation.example.BankAccount;

public class Demo {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Ranuth hacker");
        System.out.println(student.getName());

        BankAccount bankAccount = new BankAccount(0.00);
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(8.0);
        System.out.println(bankAccount.getBalance());
        bankAccount.withDraw(7);
        System.out.println(bankAccount.getBalance());
    }

}
