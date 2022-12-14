package com.saran;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="xyz")

public class Product {
	@Id
	private int prdId;
	@Column(name="product_name")
	private String prdName;
	private int prdPrice;

}
