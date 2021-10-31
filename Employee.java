/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignsec2;

import java.util.Date;

/**
 *
 * @author islam
 */
public class Employee extends Person{
    private int office;
    private double salary;
    private MyDate date;
    private String className=this.getClass().getName();
    public Employee(String name,String PhoneNumber,String Email,String address,int office,double salary,int d,int m , int y)
            {
                super(name,PhoneNumber,Email,address);
                this.office=office;
                this.salary=salary;
                date=new MyDate(y,m,d);
            }
     public String clasName()
    {
        return className+":"+super.getName();
    }
  
}
