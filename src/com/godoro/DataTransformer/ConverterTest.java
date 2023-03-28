package com.godoro.DataTransformer;

public class ConverterTest {
	
	
	public static void main(String[] args) {
	
		Product product = new Product(1, "Cep Telefonu", 12.5000);
	    ProductConverter converter = new ProductConverter();

	   
	    String productString = converter.format(product);
	    System.out.println("Product string: " + productString);
	    
	 
	    Product parsedProduct = converter.parse(productString);
	   System.out.println(parsedProduct.getProductId());
       System.out.println(parsedProduct.getProductName());
       System.out.println(parsedProduct.getSalesPrice());
       
       
       ProductFormat format = new ProductFormat();
       format.printfProduct(product);
       
       ProductScan scan = new ProductScan();
       Product product2=scan.ProductScanner();
       format.printfProduct(product2);
	}

	
}
