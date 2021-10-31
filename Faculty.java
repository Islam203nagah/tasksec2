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
public class Faculty extends Employee{
    private double office_hourse;
    private double rank;
    private String classname=this.getClass().getName();
    public  Faculty(String name,String PhoneNumber,String Email,String address,int office, double salarey ,double officeHours,double rank ,int d,int m , int y)
    {
        super(name,PhoneNumber,Email,address ,office, salarey, d, m ,  y);
        this.office_hourse=office_hourse;
        this.rank=rank;
    }
    public String clasName()
    {
        return classname+" person name :"+super.getName();
    }
}
