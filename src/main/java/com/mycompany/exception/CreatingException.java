
package com.mycompany.exception;

import java.util.Scanner;

class OutOfRangeException extends Exception
{
    void checkvalue(int value,int MIN,int MAX) throws OutOfRangeException
    {
        if (value < MIN || value > MAX)
        {
            throw new OutOfRangeException();
        }
    }
}
public class CreatingException 
{

    public static void main(String[] args) 
    {
        OutOfRangeException x = new OutOfRangeException();
        final int MIN = 0 , MAX = 30 ;
        int value = 0;
        
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Score : ");
            value = scan.nextInt();
            x.checkvalue(value, MIN, MAX);
        }
        
        catch (OutOfRangeException e)
        {
                     System.out.println(e + "\n หมายถึง \"ข้อผิดพลาด" 
            + "ที่เกิดจากการข้อมูลคะแนนเกินขอบเขต\"");
                     System.exit(0); // ใส่เพื่อนไม่ให้ finally ทำงานต่อ
         }
        catch (Exception e)
        {
             System.out.println(e + "\n หมายถึง \"ข้อผิดพลาด" 
            + "ที่เกิดจากการข้อมูลเข้าผิดประเภท\"");
            System.exit(0);
        }
        finally
                {
                    System.out.println("คะแนนคือ " + value*100.0f/MAX + "%");
                }
    }
    
}
