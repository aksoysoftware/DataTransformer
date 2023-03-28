package com.godoro.DataTransformer;

public class ProductConverter {
	
	
	public String format(Product product) {
		StringBuffer sb = new StringBuffer();
        sb.append(product.getProductId()).append(",")
          .append(product.getProductName()).append(",")
          .append(product.getSalesPrice());
        return sb.toString();

	}
	public Product parse(String line) {
	      String[] fields = line.split(",");
	        long productId = Long.parseLong(fields[0]);
	        String productName = fields[1];
	        double salesPrice = Double.parseDouble(fields[2]);
	        return new Product(productId, productName, salesPrice);
		
	}

}
