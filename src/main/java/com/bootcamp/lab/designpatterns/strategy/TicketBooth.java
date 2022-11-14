package com.bootcamp.lab.designpatterns.strategy;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TicketBooth {

	public static void main(String[] args) {
		
		
		double taxPercentage = 0.2F;
		AbstractTicketCategory childTicket = TicketCategory.instance().getTicketCategory(TicketType.CHILD, new BigDecimal(taxPercentage));
		AbstractTicketCategory adultTicket = TicketCategory.instance().getTicketCategory(TicketType.ADULT, new BigDecimal(taxPercentage));
		AbstractTicketCategory seniorTicket = TicketCategory.instance().getTicketCategory(TicketType.SENIOR, new BigDecimal(taxPercentage));
	
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		System.out.println("Children Ticket w/ tax: " + decimalFormat.format(childTicket.calculateTotalPrice()));
		System.out.println("Adults Ticket w/ tax: " + decimalFormat.format(adultTicket.calculateTotalPrice()));
		System.out.println("Seniors Ticket w/ tax: " + decimalFormat.format(seniorTicket.calculateTotalPrice()));

	
	}

}
