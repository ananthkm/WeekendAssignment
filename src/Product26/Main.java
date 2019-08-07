package Product26;

import java.util.Scanner;

public class Main extends Product{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product Id : ");
		long id = sc.nextLong();
		System.out.println("Enter the product name : ");
		String prodName = sc.next();
		System.out.println("Is the product supplied by Nivas Suppliers? Type 'yes' or 'no' (not case sensitive)");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("yes")){
			Product p = new Product(id,prodName);
			p.display();
		}	
		else{
			System.out.println("Enter Supplier name :");
			String suppName = sc.next();
			Product p = new Product(id,prodName,suppName);
			p.display();
			
		}
		
	}

}
