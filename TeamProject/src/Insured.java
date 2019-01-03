import java.util.Scanner;


public class Insured {

	static Scanner sc=new Scanner(System.in);
	 @SuppressWarnings("unused")
	public void  user(){
         String username = null;
		//int option=0;
		 if(username==null){
         System.out.println("1.Account creation");
         System.out.println("2.View Policy");
         System.out.println("Enter the choice");
         
		int option=sc.nextInt();
	switch (option) {
	case 1: 
     accountCreation();
		break;
	case 2:
		viewPolicy();
	default:
		break;
	}
		 }
		 else if(username!=null){
			 System.out.println("1.view policy");
		 }
		 else{
			 System.out.println("enter correct credentials");
		 }
				 }
         
				 		
        	 
         
	 public static void accountCreation(){
		 System.out.println("Enter the Insured Name ");
		 String insuredName=sc.next();
		 System.out.println("Enter the Insured Street ");
		 String insuredStreet=sc.next();
		 System.out.println("Enter the Insured City ");
		 String insuredCity=sc.next();
		 System.out.println("Enter the Insured State ");
		 String insuredState=sc.next();
		 System.out.println("Enter the Insured Zip ");
		 String insuredZip=sc.next();
		 System.out.println("Enter the Business Segment ");
		 String businessSegment=sc.next();
		 //System.out.println("Enter the Account Number ");
		 //sending these details to database 
				 
	 }
	 public static void viewPolicy(){
		 
	 }
	public static void main(String[] args) {
		Insured in=new Insured();
		in.user();
	}
}
