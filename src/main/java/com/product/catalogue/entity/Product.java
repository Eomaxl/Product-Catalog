package com.product.catalogue.entity;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String productName;
	private String productDesc;
	private String productSeller;
	private String productType;
	private int productPerUnit;
	private double productPrice;
	private long productStock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return productName;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public String getDescription() {
		return productDesc;
	}

	public void setDescription(String description) {
		this.productDesc = description;
	}

	public String getSupplierId() {
		return productSeller;
	}

	public void setSupplierId(String supplierId) {
		this.productSeller = supplierId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getQuantityPerUnit() {
		return productPerUnit;
	}

	public void setQuantityPerUnit(int quantityPerUnit) {
		this.productPerUnit = quantityPerUnit;
	}

	public double getUnitPrice() {
		return productPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.productPrice = unitPrice;
	}

	public long getUnitsInStock() {
		return productStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.productStock = unitsInStock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((productDesc == null) ? 0 : productDesc.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPerUnit;
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productSeller == null) ? 0 : productSeller.hashCode());
		result = prime * result + (int) (productStock ^ (productStock >>> 32));
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (productDesc == null) {
			if (other.productDesc != null)
				return false;
		} else if (!productDesc.equals(other.productDesc))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPerUnit != other.productPerUnit)
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (productSeller == null) {
			if (other.productSeller != null)
				return false;
		} else if (!productSeller.equals(other.productSeller))
			return false;
		if (productStock != other.productStock)
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		return true;
	}

	
	

	

}
