import java.util.*;
    class Q5{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Basic Salary: ");
            double b_s=sc.nextDouble();
            double HRA=(40/100)*b_s;
           
            double PF=(12/100)*b_s;
            double MA=1200;
            double TA=800;
            double PT=300;
            double total_sal=(b_s+HRA+MA+TA)-(PF+PT);
            System.out.print("Total Salary= "+total_sal);
           
        }

    }