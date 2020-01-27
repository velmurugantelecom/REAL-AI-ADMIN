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
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 8752553615176300576L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", updatable = false, nullable = false)
	private Long userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "description")
	private String description;

}
