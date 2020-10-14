import java.util.Scanner;

public class FinancialApplication {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter employee's name: ");
    String name = input.next();

    System.out.print("Enter number of hours worked in a week: ");
    double hours = input.nextDouble();

    System.out.print("Enter hourly pay rate: ");
    double hourlyPayRate = input.nextDouble();

    System.out.print("Enter federal tax withholding rate: ");
    double federalTax = input.nextDouble();

    System.out.print("Enter state tax withholding rate: ");
    double stateTax = input.nextDouble();

    double grossPay = hours * hourlyPayRate;
    double FTax = grossPay * federalTax;
    double newFTax = Math.round(FTax* 100.0) /100.0;
    double STax = grossPay * stateTax;
    double newSTax = Math.round(STax* 100.0) /100.0;
    System.out.println("Employee Name: " + name);
    System.out.println("Hours Worked: " + hours);
    System.out.println("Pay Rate: $" + hourlyPayRate);
    System.out.println("Gross Pay: $" + grossPay);
    System.out.println("Deductions: ");
    System.out.println("   Federal Withholding (" + federalTax * 100 + "%): $" + newFTax);
    System.out.println("   State Withholding (" + stateTax * 100 + "%): $" + newSTax) ;
    System.out.println("   Total Deduction: $" + (newFTax + newSTax));
    System.out.println("Net Pay: $" + (grossPay - (newFTax + newSTax)) );


  }

}
