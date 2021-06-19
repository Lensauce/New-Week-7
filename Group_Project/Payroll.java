
/**
 * Write a description of class Payroll here.
 * Employee Paycheck program with text boxes.
 * @author Chris Lenick
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class Payroll
{
   public static void main(String[] args)
   {
       String empName;
       String inputStr;
       String outputStr;
        
       empName = JOptionPane.showInputDialog("Please enter employee name: ");
       
       inputStr = JOptionPane.showInputDialog("Please enter number of hours worked: ");
       double hoursWorked = Double.parseDouble(inputStr);
       
        double payRate = 10.00;
        double grossAmount = hoursWorked * payRate;
        double federalTax = grossAmount * 0.15;
        double stateTax = grossAmount * 0.035;
        double socialSecurityTax = grossAmount * 0.0575;
        double pensionPlan = grossAmount * 0.05;
        double healthInsurance = grossAmount * 0.04;
        double netPay = grossAmount - (federalTax + stateTax + socialSecurityTax + pensionPlan + healthInsurance);
        
        if (hoursWorked > 40.0)
          grossAmount = 40.0 * payRate + 1.5 * payRate * (hoursWorked - 40.0);
      else
          grossAmount = hoursWorked * payRate;
       
       outputStr = "Employee paycheck equals " + String.format("$%.2f", netPay);
       JOptionPane.showMessageDialog(null, outputStr, "Employee Net Pay",JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
    }
}

       
       
       
       
       
       
