
package Oop;

import java.util.*;
public class RockGama {
    
    public static void main(String[] args) {
        
    boolean rs = true;
    System.out.println("Welcome to rock paper sissor Game");
     System.out.println(" If you want to choose rock enter 1 \n If you want to paper rock enter 2 \n If you want to choose sissor enter 3");
    Random r = new Random();//create random object
    int com = r.nextInt(3)+1;//random number between 1 and 3
    do{//run code once and exception occure loop will start
         try{//check weather input is a integer or not
     Scanner s = new Scanner(System.in);//scanner object
     int user  = s.nextInt();//new input from user
     System.out.println("You entered number : "+user);
     System.out.println("computer entered num "+com);
     if(user<0 || user >3){
         System.out.println("Enter number between 0 and 4");
         
         
     }
     else{
         if(user==3 && com ==1){//check user and computer
             System.out.println("You are lost\n sissor will be broken by rock");
         }
         else if(user==3 && com==2){//check user and computer
             System.out.println("You win \n you can cut the paper");
             
         }
         else if(user==3 || com ==3){//check user and computer
         System.out.println("no result ");
         
             
         }
         switch(user){
             case 2 :
                 if(com==1){//check user and computer
                     System.out.println("You win \n rock can be cover by paper");
                 }
                 else if(com==2){//check user and computer
                     System.out.println("no result ");
                 }
                 else if(com ==3){//check user and computer
                     System.out.println("You lost\n paper will be cutted by sissor");
                 }
                 
             case 1:
                 if(com==3){//check user and computer
                     System.out.println("You win \n brock the sissor");
                 }
                 else if(com==2){//check user and computer
                     System.out.println(" You lost \n rock will be covered by paper");
                 }
                 else if(com ==1){//check user and computer
                     System.out.println("You lost\n paper will be cutted by sissor");
                 }
             
     }
     }
     rs =true;//no exception.
     
    
    
    
    }catch(Exception e) {
        System.out.println("Please Enter a Integer Between 0 and 4 ");
        rs = false;//exception has occured
    }
    }while(rs==false);
   
           
    
}
}
