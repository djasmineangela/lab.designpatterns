package com.bootcamp.lab.designpatterns.strategy.bean;

import java.math.BigDecimal;

import com.bootcamp.lab.designpatterns.strategy.AbstractTicketCategory;
import com.bootcamp.lab.designpatterns.strategy.interfaces.TicketCalculation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildCategory extends AbstractTicketCategory implements TicketCalculation{
	private static final BigDecimal CHILDREN_TICKET_PRICE = new BigDecimal(10);
	private BigDecimal childTicketTax;
	
	@Override
	public BigDecimal getTicketPrice() {
		// TODO Auto-generated method stub
		return CHILDREN_TICKET_PRICE;
	}

	@Override
	public BigDecimal getTicketTax() {
		// TODO Auto-generated method stub
		return this.childTicketTax;
	}

	
	

}
