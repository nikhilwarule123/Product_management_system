package com.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String mobile;
	String tbl_ordercol;
	String productid;
	String productqnt;
	String totalprice;
	String status;
	String created;
	String updated;
	String product_id;
	String product_qnt;
	String total_price;
	public Order() {
		super();
	}
	public Order(int id, String mobile, String tbl_ordercol, String productid, String productqnt, String totalprice,
			String status, String created, String updated, String product_id, String product_qnt, String total_price) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.tbl_ordercol = tbl_ordercol;
		this.productid = productid;
		this.productqnt = productqnt;
		this.totalprice = totalprice;
		this.status = status;
		this.created = created;
		this.updated = updated;
		this.product_id = product_id;
		this.product_qnt = product_qnt;
		this.total_price = total_price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTbl_ordercol() {
		return tbl_ordercol;
	}
	public void setTbl_ordercol(String tbl_ordercol) {
		this.tbl_ordercol = tbl_ordercol;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductqnt() {
		return productqnt;
	}
	public void setProductqnt(String productqnt) {
		this.productqnt = productqnt;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_qnt() {
		return product_qnt;
	}
	public void setProduct_qnt(String product_qnt) {
		this.product_qnt = product_qnt;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	
	
	

}
