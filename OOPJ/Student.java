package in.acts.cdac;

import java.util.Scanner;
import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String address;
    private String email;

    public Student() {
       
    }

    public Student(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    // Mutator methods
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    // toString method to return student details
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            students[i] = new Student(name, age, address, email);
        }

        System.out.println("Student details:");
        System.out.println(Arrays.toString(students));

        // Ask user for an address
        System.out.print("Enter an address: ");
        String userAddress = sc.nextLine();

        // Print students who live in the entered address
        for (Student student : students) {
            if (student.getAddress().equalsIgnoreCase(userAddress)) {
                System.out.println(student);
            }
        }

        // Print students whose email address contains "gmail.com"
        for (Student student : students) {
            if (student.getEmail().contains("gmail.com")) {
                System.out.println(student);
            }
        }
    }
}
