package com.tuyano.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mydata")
@Getter
@Setter
public class MyData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column

	private long id;
	
	@Column(length = 50, nullable = true)
	private String name;

	@Column(length = 200, nullable = true)
	private String mail;

	@Column(nullable = true)
	private Integer age;
	
	@Column(length = 200, nullable = true)
	private String memo;
	
	@Column(length = 500, nullable = true)
	private Date date =new Date();
	
	@Column(length = 200, nullable = true)
	private String title;
	
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getMail() {
//		return mail;
//	}
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//
//	public String getMemo() {
//		return memo;
//	}
//	public void setMemo(String memo) {
//		this.memo = memo;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date= date;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
}
