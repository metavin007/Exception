package com.mycompany.exception;

import java.util.Scanner;

public class InputMisType 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter X : ");
            int x = scan.nextInt();
            System.out.print("Enter Y : ");
            int y = scan.nextInt();
            System.out.println(x/y);
        }
        catch (ArithmeticException e1)
        {
            System.out.println(e1 + "\n หมายถึง \"ข้อผิดพลาด" 
            + "ที่เกิดจากการหารด้วยศูนย์\"");
        }
        catch (Exception e2)
        {
            System.out.println(e2 + "\n หมายถึง \"ข้อผิดพลาด" 
            + "ที่เกิดจากการใส่ข้อมูลผิดประเภท\"");
        }
    }   
}
