/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefundamentalsstudents;

/**
 *
 * @author aulak sheridan college
 May 22nd,2019*/
public class SoftwareFundamentalsStudents {
    private int sid;
    private int Maxcourse;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
   private String name;//encapsulation
   //constructors--------------------------------------------------------------------------------------------------
   public SoftwareFundamentalsStudents(){
         
   }
   public SoftwareFundamentalsStudents(String n,int s){
       this.name=n;
       this.sid=s;
   
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

    /**
     * @return the Maxcourse
     */
    public int getMaxcourse() {
        return Maxcourse;
    }

    /**
     * @param Maxcourse the Maxcourse to set
     */
    public void setMaxcourse(int Maxcourse) {
        this.Maxcourse = Maxcourse;
    }

    
}
