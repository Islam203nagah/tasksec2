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
public class MyDate {
    private int year;
    private int mounth;
    private int day;
    private String classname=this.getClass().getName();
    public MyDate(int year ,int month ,int day ) {
		this.year = year;
		this.mounth =month;
		this.day =day ;
    }
    public void Display()
    {
		System.out.println("Year : "+year +"month :"+ mounth+"Day :"+day );
		
    }
    public String clasName()
    {
        return classname+":"+super.getName();
    }
}
