//reverse values of integer..
import java.util.*;
public class Reverse{
  public static void main(String args[]){
    int rev;
	
	boolean n = true;
	do{//if exception occure loop will run until get correct type of input
		try{//to check user weather input is a integer or no
	Scanner test1 =new Scanner(System.in); //scanner object
    System.out.println("Enter a Number ");//call to user input
    int num=test1.nextInt();//user input
	
	while(num!=0){
     
     rev = num%10;//last num of given input
     num = num/10;//call to reamin 
     System.out.print( rev );//last number list
     
    }
	 System.out.print('\n');
	n=true;//goal is true
	
	
	}catch(Exception e){
		System.out.println("enter a integer please");
		n= false;
	}
	
    
	}while(n==false);
		
	
	
    
  }
}
