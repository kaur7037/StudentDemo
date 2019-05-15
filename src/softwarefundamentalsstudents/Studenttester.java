/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefundamentalsstudents;

/**
 *
 * @author aulak
 */
public class Studenttester {
   public static void main(String[] args) {
     SoftwareFundamentalsStudents s1= new SoftwareFundamentalsStudents ();
     s1.setName("Gagan");
     //System.out.println(s1.getName());
     SoftwareFundamentalsStudents s2= new SoftwareFundamentalsStudents ();
     s2.setName("Gurleen");
    // System.out.println(s2.getName());
     SoftwareFundamentalsStudents s3= new SoftwareFundamentalsStudents ();
     s3.setName("Gurjot");
    // System.out.println(s3.getName());
     
     SoftwareFundamentalsStudents [] list=new SoftwareFundamentalsStudents[3];
     list[0]=s1;
     list[1]=s2;
     list[2]=s3;
     for(int i=0; i<list.length; i++){
         System.out.println(list[i].getName());
     }

}
}
