/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignsec2;

/**
 *
 * @author islam
 */
public class Student extends Person{
    private String classname=this.getClass().getName();
    public Student(String name,String PhoneNumber,String Email,String address)
    {
        super(name,PhoneNumber,Email,address);
    }
    public String clasName()
    {
        return classname+" person name :"+super.getName();
    }
}
