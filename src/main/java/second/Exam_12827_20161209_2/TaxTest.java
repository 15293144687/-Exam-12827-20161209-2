package second.Exam_12827_20161209_2;

import java.util.Scanner;

public class TaxTest {

	public static void main(String[] args) {
		System.out.println("请输入工资：");
		Scanner scanner = new Scanner(System.in);
		Integer salary = Integer.parseInt(scanner.nextLine());
		Integer desalary = salary - 3500;
		double tax = 0;
		Double taxlevel1 = 1500 * 0.03;
		Double taxlevel2 = taxlevel1 + 3000 * 0.1;
		Double taxlevel3 = taxlevel2 + 4500 * 0.2;
		Double taxlevel4 = taxlevel3 + (35000 - 9000) * 0.25;
		Double taxlevel5 = taxlevel4 + (55000 - 35000) * 0.3;
		Double taxlevel6 = taxlevel5 + (80000 - 55000) * 0.35;

		if (desalary <= 1500) {
			tax = desalary * 0.03;
		} else if ((desalary > 1500) && (desalary <= 4500)) {
			tax = taxlevel1+(desalary-1500)*0.1;
		} else if ((desalary > 4500) && (desalary <= 9000)) {
			tax = taxlevel2+(desalary-4500)*0.1;
		} else if ((desalary > 9000) && (desalary <= 35000)) {
			tax = taxlevel3+(desalary-9000)*0.1;
		} else if ((desalary > 35000) && (desalary <= 55000)) {
			tax = taxlevel4+(desalary-35000)*0.1;
		} else if ((desalary > 55000) && (desalary <= 80000)) {
			tax = taxlevel5+(desalary-55000)*0.1;
		} else if ((desalary > 80000)){
			tax = taxlevel6+(desalary-80000)*0.1;
		}
		System.out.println("所需缴纳的税费为："+tax);
	}
}
