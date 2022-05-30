package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricesDetailDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5569352923108148136L;
	private BigDecimal pricePerDayAdult;
    private BigDecimal pricePerDayChild;

}
