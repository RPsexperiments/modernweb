package com.modernweb.backend.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "demotable")
//@Data
@Getter
@Setter
//lombok has issues and the field values are not getting returned as part of rest request. 
//hence getters and setters added explicitly

public class DemoEntity {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDemoString() {
		return demoString;
	}

	public void setDemoString(String demoString) {
		this.demoString = demoString;
	}

	public String getDemoCode() {
		return demoCode;
	}

	public void setDemoCode(String demoCode) {
		this.demoCode = demoCode;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "demostring")
	private String demoString;

	@Column(name = "democode")
	private String demoCode;
	

}
