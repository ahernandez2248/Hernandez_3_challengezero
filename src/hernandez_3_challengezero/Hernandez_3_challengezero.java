/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hernandez_3_challengezero;

/**
 *
 * @author ahernandez2248
 */
public class Hernandez_3_challengezero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int i= 1; i <501; i ++) {
          if(isDivisiblebytwo(i) && isDivisiblebythree(i) && isDivisiblebyfive(i)){
              System.out.println("Team Building");
          }
          else if(isDivisiblebythree(i) && isDivisiblebyfive(i)){
              System.out.println("Old School");
          }
          else if(isDivisiblebytwo(i) && isDivisiblebythree(i)){
              System.out.println("chismé");
          }
          else if(isDivisiblebyfive(i)){ 
              if(i % 55 == 0){
                 System.out.println("Animate this!");
              }
              else{ 
                  System.out.println("Vidal");
              }
          }
          else if(isDivisiblebythree(i)){
              if(i % 33 == 0){
                  System.out.println("Herr Direktor");
              }
              else{
                  System.out.println("Claughton");
              }
             
          }
          else if(isDivisiblebytwo(i)){
              if(i % 22 == 0){
                  System.out.println("ninja");
              }
              else{
                  System.out.println("Davis");
              }
          }
          
          }
      }
        
        
       
       
    static boolean isDivisiblebytwo(int number){
           return(number % 2 == 0);
    }
    static boolean isDivisiblebythree(int number){
        return(number % 3 == 0);
    }
    static boolean isDivisiblebyfive(int number){
        return(number % 5 == 0);
    }
}  

