package com.bootcamp.lab.designpatterns.strategy;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public abstract class AbstractTicketCategory {
	private BigDecimal totalPrice;
	
	public abstract BigDecimal getTicketPrice();
	public abstract BigDecimal getTicketTax();
	
	public BigDecimal calculateTotalPrice() {
		BigDecimal totalPrice = getTicketPrice().add(getTicketPrice().multiply(getTicketTax()));
		return totalPrice;
	}	
}
