package com.medicare.we.products.entity;



import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class Products {

	@Id
	String id;
	String prodCategory;
	String prodName;
	int prodQuantity;
	int prodPrice;
	String prodBrand;
	String prodDesc;
	char prodAvail;
	String prodImg;



}
