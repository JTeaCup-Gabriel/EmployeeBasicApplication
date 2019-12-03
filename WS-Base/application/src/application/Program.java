package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		// -------------------------------------------------------------------- >
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		// -------------------------------------------------------------------- >
		for (int i = 1; i <= N; i++) {

			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));

		}
		// -------------------------------------------------------------------- >
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		// -------------------------------------------------------------------- >
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		// -------------------------------------------------------------------- >
		// -------------------------------------------------------------------- >
		sc.close();

	}

}
