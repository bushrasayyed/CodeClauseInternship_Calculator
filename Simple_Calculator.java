package My_Projects;
import java.util.*;
public class Simple_Calculator {
	public static void main(String[] args) {
		double output;
		Scanner sc=new Scanner(System.in);
    System.out.println("---This is a console - based Calculator--");
    System.out.println("Enter number 1 :");
    double num1=sc.nextDouble();
    System.out.println("Enter number 2 :");
    double num2=sc.nextDouble();
    System.out.println("Select the Operation You have to perform\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
    int choice=sc.nextInt();
    switch(choice)
    {
    case 1:
    	output = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + output);
        break;
    case 2:
    	output = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + output);
        break;
    case 3:
    	output = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + output);
        break;
    case 4:
    	output = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + output);
        break;
    default:
        System.out.println("Syntax error");
        break;
    }
    sc.close();
    
	}

}
