package com.godoro.DataTransformer;

public class ProductFormat {
	
	
	public void printfProduct( Product product) {
		
		
		System.out.printf(" Urun ID: %d%n Urun adi: %s%n Satis Fiyati: %.2f %n", product.getProductId() , product.getProductName() , product.getSalesPrice());
		
	}



	
}
