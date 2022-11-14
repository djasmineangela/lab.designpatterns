package com.bootcamp.lab.designpatterns.strategy;

import java.math.BigDecimal;

import com.bootcamp.lab.designpatterns.strategy.bean.AdultCategory;
import com.bootcamp.lab.designpatterns.strategy.bean.ChildCategory;
import com.bootcamp.lab.designpatterns.strategy.bean.SeniorCategory;

public class TicketCategory {
	private static TicketCategory INSTANCE;

    private TicketCategory() {
    	
    }

    public static TicketCategory instance() {
        if (INSTANCE == null) {
            INSTANCE = new TicketCategory();
        }
        
        return INSTANCE;
    }

    public AbstractTicketCategory getTicketCategory(TicketType type, BigDecimal tax) {
        AbstractTicketCategory ticketCategory = null;
        
        switch (type) {
            case CHILD:
            	ticketCategory = new ChildCategory(tax);
                break;
            case ADULT:
                ticketCategory = new AdultCategory(tax);
                break;
            case SENIOR:
            	ticketCategory = new SeniorCategory(tax);
                break;
                
        }
        
        return ticketCategory;
        
    }
}
