package com.buy.sell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="buySellService")
public class BuySellService  {

	/* (non-Javadoc)
	 * @see com.nibado.example.springaop.service.BuySellServiceInterface#performBuySell()
	 */
	
	@Autowired
	BuySellTipsDto tipsWriting;
	
	public void performBuySell() {
		System.out.println(" BuySellService:: performBuySell is called");
	
		//writeToTips();
	
		tipsWriting.writeToTips();
		
		System.out.println("Ending of performBuySell : printed after aop invocation");
		
	}
	
	
	/* (non-Javadoc)
	 * @see com.nibado.example.springaop.service.BuySellServiceInterface#writeToTips()
	 */

	}
