package com.godoro.DataTransformer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductScan {
	
	 
	 public Product ProductScanner() throws InputMismatchException {
		 try (Scanner scanner = new Scanner(System.in)) {
			 System.out.print("Urun ID: ");
	        long productId = scanner.nextLong();
	        scanner.nextLine(); 

	        System.out.print("Urun adi: ");
	        String productName = scanner.nextLine();

	        System.out.print("Satis Fiyati: ");
	        double salesPrice = scanner.nextDouble();

	        Product product = new Product(productId, productName, salesPrice);

	        return product;

	       
		} catch (Exception e) {
			System.out.println("Hatali deger girdiniz");
		}
		return null;
		 
		
	    }
	 
}