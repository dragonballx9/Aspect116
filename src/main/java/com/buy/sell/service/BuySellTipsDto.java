package com.buy.sell.service;

import org.springframework.stereotype.Component;

import com.buy.sell.annotation.interfaces.ExecutePendingBuySell;
import com.buy.sell.annotation.interfaces.PlacePendingBuySell;

@Component
public class BuySellTipsDto {

	
	@PlacePendingBuySell
	public void writeToTips() {
		System.out.println("TipsWriting # BuySellService==> writeToTips :::  Check if AOP invoked");
	}

	@ExecutePendingBuySell
	public void executePendingBuySell() {
		System.out.println("TipsWriting # BuySellService==> executePendingBuySell :::  This will print after AOP call");
	}
	
	
}
