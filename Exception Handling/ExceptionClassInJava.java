package com.naman;
import java.util.Scanner;
// run time polymorphism
//run time polymorphism
class MyException extends Exception{
    @Override
	public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class ExceptionClassInJava {
  public static void main(String[] args) {
		int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                 throw new MyException();
               
                //throw new ArithmeticException("This is an exception");
            }
            catch (MyException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
		

	}

}
