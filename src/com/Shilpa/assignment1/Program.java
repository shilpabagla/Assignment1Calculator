/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.assignment1;
import java.util.Scanner;

/**
 *
 * @author Shilpa
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
        System.out.println("Enter the first number:");
        int x = input.nextInt();
        System.out.println("Enter the second number:");
        int y = input.nextInt();
        System.out.println("Select your choice :");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Min");
        System.out.println("6. Max");
        System.out.println("7. Power");
        System.out.println("8. Multiplication Table");
        System.out.println("9. Exit");
        int choice= input.nextInt() ;
        int total =0;
         switch(choice){
             case 1:
                 total = x+y;
                 System.out.println("sum="+ total);
                 break;
             case 2:
                 total = x-y;
                 System.out.println("difference="+ total);
                 break;
            case 3:
                 total = x*y;
                 System.out.println("Product="+ total);
                 break;
             case 4:
                 total = x/y;
                 System.out.println("Division="+ total);
                 break;
             case 5:
                 if (x<y)
                     System.out.println("minimum="+ x);
                 else
                     System.out.println("minimum="+ y);
                 break;
             case 6:
                 if (x>y)
                     System.out.println("maximum="+ x);
                 else
                     System.out.println("maximum="+ y);
                 break;
            case 7:
                 total= (int) Math.pow(x,y);
                 System.out.println("Power=" + total);
                 break;
            case 8:
                int i;
                System.out.println("Multiplication table =" );
                for ( i= 1 ; i <= y ; i++ ){
                total= x*i;
                 System.out.println(x+"*"+i+" = "+total);}
                 break;
            
            case 9:
                System.exit(0);
                break;
         }
            System.out.println("Do you want to continue (Y/N)?");
            String c= input.next();
            if(c.equalsIgnoreCase("n"))
                System.exit(0);
          
        }
        
        
    }
