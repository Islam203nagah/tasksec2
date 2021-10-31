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
public class Staff extends Employee{
    private String title;
    private String classname=this.getClass().getName();
    public Staff(String name,String PhoneNumber,String Email,String address,int office,double salary,String title,int d,int m , int y)
    {
        
        this.title=title;
    }
 public String clasName()
    {
        return classname+" person name :"+super.getName();
    }
}
