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
public class Person {
   private String name;
   private String PhoneNumber;
   private String Email;
   private String address;
   private String classname=this.getClass().getName();
   public Person(String name,String PhoneNumber,String Email,String address)
   {
       this.name=name;
       this.address=address;
       this.PhoneNumber=PhoneNumber;
       this.Email=Email;
   }

    /**
     * @return the name
     */
    
    public String getName() {
        return name;
    }
    public String clasName()
    {
        return name+" person name :"+classname;
    }
  
    
}
