package com.tyc.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bicycle")
public class Bicycle implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	@GenericGenerator(name = "paymentableGenerator", strategy = "increment")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bid",unique=true,nullable=false)
	private int  bid;
	
	//uidΪ���
    //@OneToOne  
    //@JoinColumn(name="uid") 
	//private User user;
	
	
	@Column(length=32)
	private String bstatus;//����״̬
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	@Column(length=32)
	private float bpriceperday;//���ռ۸�
	@Column(length=32)
	private String bdamage;//�Ƿ���
	@Column(length=32)
	private float brentmoney;//���
	@Column(length=32)
	private String btype;//����
	@Column(length=64)
	private String bimageurl;//ͼƬ����
	
	
	
	public String getBstatus() {
		return bstatus;
	}
	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}
	public float getBpriceperday() {
		return bpriceperday;
	}
	public void setBpriceperday(float bpriceperday) {
		this.bpriceperday = bpriceperday;
	}
	public String getBdamage() {
		return bdamage;
	}
	public void setBdamage(String bdamage) {
		this.bdamage = bdamage;
	}
	public float getBrentmoney() {
		return brentmoney;
	}
	public void setBrentmoney(float brentmoney) {
		this.brentmoney = brentmoney;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getBimageurl() {
		return bimageurl;
	}
	public void setBimageurl(String bimageurl) {
		this.bimageurl = bimageurl;
	}
	@Override
	public String toString()
	{
		return "!!!";
	}
}
