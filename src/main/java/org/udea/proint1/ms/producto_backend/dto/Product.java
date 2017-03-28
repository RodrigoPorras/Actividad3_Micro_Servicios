package org.udea.proint1.ms.producto_backend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {
	
	
	@Id
	//TAREA: @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="secuence_name")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_id")
	@SequenceGenerator(name="product_id",sequenceName="product_id_seq",allocationSize=1)
	@Column(name="id")
	private long id;
	
	@NotNull
	private String code;
	
	@NotNull
	private String description;
	
	public Product(){
		
	}
	
	
	public Product(long id, String code, String description) {
		super();		
		this.id = id;
		this.code = code;
		this.description = description;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", description=" + description + "]";
	}	

	
}
