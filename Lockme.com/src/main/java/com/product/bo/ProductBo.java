package com.product.bo;

import java.util.List;

import com.product.Exception.BussinessException;
import com.product.model.Product;

public interface ProductBo  {
   public static  Product addProduct(Product product)  throws   BussinessException {
	// TODO Auto-generated method stub
	return product;
}
   public Product getProductById(int id) throws  BussinessException;
   public List<Product> getProductManufcturerName(String manufctureName) throws BussinessException;
   public Product updateProductprice(int id,double newCost) throws BussinessException;
   public void deleteProduct(int id ) throws BussinessException;
   
 	
}
