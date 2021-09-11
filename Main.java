import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    float Operator_Digit_Variabel_A;
    float Operator_Digit_Variabel_B;
    char Operator_Option;
    float Total_Of_Operator_Variabel;
    Scanner Operator_Input_User = new Scanner(System.in);
    System.out.print("Welcome to console enter (+,-,/,*) for the operator \n");
    System.out.print("Your first digit: ");
    Operator_Digit_Variabel_A = Operator_Input_User.nextFloat();
    System.out.print("\n Your operator: ");
    Operator_Option = Operator_Input_User.next().charAt(0);
    System.out.print("Your second digit: ");
    Operator_Digit_Variabel_B = Operator_Input_User.nextFloat();
    System.out.print("Your request: " + Operator_Digit_Variabel_A + Operator_Option + Operator_Digit_Variabel_B + "\n");
    
    if (Operator_Option == '+') {
      Total_Of_Operator_Variabel = Operator_Digit_Variabel_A + Operator_Digit_Variabel_B;
      System.out.print("Result: " + Total_Of_Operator_Variabel);
    } else if (Operator_Option == '-') {
      Total_Of_Operator_Variabel = Operator_Digit_Variabel_A - Operator_Digit_Variabel_B;
      System.out.print("Result: " + Total_Of_Operator_Variabel);
    } else if (Operator_Option == '*') {
      Total_Of_Operator_Variabel = Operator_Digit_Variabel_A * Operator_Digit_Variabel_B;
      System.out.print("Result: " + Total_Of_Operator_Variabel);
    } else if (Operator_Option == '/') {
      if (Operator_Digit_Variabel_B == 0) {
        System.out.print("The result of divided by 0 is infinity");
      } else {
        Total_Of_Operator_Variabel = Operator_Digit_Variabel_A + Operator_Digit_Variabel_B;
      System.out.print("Result: " + Total_Of_Operator_Variabel);
      }
    } else {
      System.out.print("Use operator (+,-,*,/)");
    }
    
  }
}