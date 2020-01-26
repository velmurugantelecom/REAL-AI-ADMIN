package com.real.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 8752553615176300576L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId", updatable = false, nullable = false)
	private Long productId;

	@Column(name = "productName")
	private String productName;

	@Column(name = "description")
	private String description;

}
