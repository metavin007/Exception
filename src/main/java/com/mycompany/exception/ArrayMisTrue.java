
package com.mycompany.exception;

public class ArrayMisTrue 
{

    public static void main(String[] args) 
    {
       int x[] = {0,1,2,3};
       try
       {
           System.out.println(x[4]);  
       }
       catch (Exception e)
       {
            System.out.println(e + "\n หมายถึง \"ข้อผิดพลาด" 
            + "ที่เกิดจากการอ้างถึงอาร์เรย์ที่เกินขอบเขต\"");
       }
    }
    
}
