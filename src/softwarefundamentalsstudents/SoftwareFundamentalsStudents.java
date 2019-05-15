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
public class SoftwareFundamentalsStudents {

    /**
     * @param args the command line arguments
     */
   private String name;//encapsulation
   //constructors--------------------------------------------------------------------------------------------------
   public SoftwareFundamentalsStudents(){
         
   }
   public SoftwareFundamentalsStudents(String n){
       this.name=n;
   
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
