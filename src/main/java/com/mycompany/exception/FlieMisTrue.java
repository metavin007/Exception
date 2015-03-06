
package com.mycompany.exception;
import java.io.*;
public class FlieMisTrue 
{

    public static void main(String[] args) 
    {
     FileInputStream f_in = null;
     File fname = new File("c:\\ByteData.txt");
     
     try
     {
         f_in = new FileInputStream(fname);
         System.out.println("Read Data from File : " + fname);
         
         int c;
         while ((c = f_in.read()) != -1)
             System.out.println(c);
     }
     catch (IOException e)
     {
         System.out.println(e + "\n หมายถึง \"ข้อผิดพลาด" 
            + "ที่เกิดจากการไม่พบไฟล์ข้อมูลที่ต้องการ\"");
     }
     
    }
    
}
