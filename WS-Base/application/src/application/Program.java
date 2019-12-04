package application;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws IOException {
		// -------------------------------------------------------------------- >
		// SimpleDateFormat sdf1 = new SimpleDateFormat("dd:MM:yy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy");
		System.out.print("Data: ");
		Date d = Date.from(Instant.parse("2019-12-04T08:37:00Z"));
		System.out.println(sdf2.format(d));
		System.out.println();
		// -------------------------------------------------------------------- >
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
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.println();
		// -------------------------------------------------------------------- >
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		// -------------------------------------------------------------------- >
		int cx = (emp == null) ? 1 : 2;
		// ---------------------------- >
		switch (cx) {
		// ---------------------------- >
		case 1:

			System.out.println("This id does not exist!");
			break;

		case 2:

			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			break;

		}
		// -------------------------------------------------------------------- >
		System.out.println();
		System.out.println("List of employees: ");
		// -------------------------------------------------------------------- >
		for (Employee obj : list) {

			System.out.println(obj);
		}
		// -------------------------------------------------------------------- >
		sc.close();

	}

}
