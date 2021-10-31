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
public class AssignSec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p=new Person ("Ahmed ","01023311","amhmadosfdafla@gmail.com","ELminia");
		System.out.println(p.toString());
		Student s =new Student ("Alaa ","01022311","amhmadosfdafla@gmail.com","ELminia");
		System.out.println(s.toString());
		Employee em =new Employee ("Asmaa ","010232311","amhmadosfdafla@gmail.com","ELminia",12,3000.0,2021,7,1);
		System.out.println(em.toString());
		Faculty f =new Faculty ("ISlam","ELminia","0102332311","amhmadosfdafla@gmail.com",12,3000.0,12,0.3,2021,7,1);
		System.out.println(f.toString());
		Staff sf =new Staff ("mohamed","minia","010","amhmadosfdafla@gmail.com",12,3000.0,"degree3",2021,7,1);
		System.out.println(sf.toString());
    }
    
}
