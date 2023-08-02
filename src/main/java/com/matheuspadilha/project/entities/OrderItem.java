package com.matheuspadilha.project.entities;

import java.io.Serializable;
import java.util.Objects;

import com.matheuspadilha.project.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_order_item")
public class OrderItem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id;
	
	private Integer quantity;
	
	private Double prive;
	
	public OrderItem() {
		
	}

	public OrderItem(Order order,Product product ,Integer quantity, Double prive) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.prive = prive;
	}
	
	public Order getOrder() {
		return id.getOrder();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrive() {
		return prive;
	}

	public void setPrive(Double prive) {
		this.prive = prive;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
