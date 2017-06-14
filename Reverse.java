import java.util.*;
public class Reverse{
  public static void main(String args[]){
    int rev;
	
	boolean n = true;
	do{
		try{
	Scanner test1 =new Scanner(System.in);
    System.out.println("Enter a Number ");
    int num=test1.nextInt();
	
	while(num!=0){
     
     rev = num%10;
     num = num/10;
     System.out.print( rev );
     
    }
	 System.out.print('\n');
	n=true;
	
	
	}catch(Exception e){
		System.out.println("enter a integer please");
		n= false;
	}
	
    
	}while(n==false);
		
	
	
    
  }
}