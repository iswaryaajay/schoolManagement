/*

 * SchoolManagement
 *
 * Students
 */
package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        final HashMap<Integer, String> studentMap = new HashMap<>();
        final Scanner scanner = new Scanner(System.in);

        studentMap.put(101, "Iswarya");
        studentMap.put(102, "Ajay");
        studentMap.put(104, "Nila");
        studentMap.put(105, "Surya");
        studentMap.put(106, "Dhoni");
        studentMap.put(107, "Aswitha");
        System.out.println("All students List");
        displayStudents(studentMap);
        System.out.println("Enter new student details");
        System.out.print("Enter student ID");
        final int newId = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter student name");
        final String newName = scanner.nextLine();

        if (studentMap.containsKey(newId)) {
            System.out.println("Student ID already exists");
        } else{
            studentMap.put(newId, newName);
        }
        System.out.println("Updated student list");
        displayStudents(studentMap);
        System.out.println("Enter a Student id to check");
        final int studentIdToCheck = scanner.nextInt();

        if (studentMap.containsKey(studentIdToCheck)) {
            System.out.println("Student id "+studentIdToCheck+"exists.");
        } else {
            System.out.println("Student id "+ studentIdToCheck+"does not exist.");
        }
    }

    private static void displayStudents(Map<Integer, String> studentMap) {
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("id:"+entry.getKey()+"Name:"+entry.getValue());
        }
    }
}
