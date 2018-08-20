package com.buy.sell.aspects;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class TxnBuySellAspect {
   
	
	@Autowired
	private HttpServletRequest httpRequest;
	//running below
   /* @After("@annotation(com.nibado.example.springaop.uri.PlacePendingBuySell) && execution(public * *(..))")
    public void placePendingBuySell() {
    	System.out.println("=============>>>>>>>>>TxnBuySellAspect:: Aspect Invoked : in PlacePendingBuySell called<<<<<<<<<=====================");
    }
*/

    @After("execution(@com.buy.sell.annotation.interfaces.PlacePendingBuySell * *(..))")
    public void placePendingBuySell() {
    	System.out.println("@After TxnBuySellAspect::placePendingBuySell Aspect Invoked : in PlacePendingBuySell called");
   
    }
    
    
    @Before("execution(@com.buy.sell.annotation.interfaces.ExecutePendingBuySell * *(..))")
    public void executePendingBuySell(JoinPoint point) {
    	
    	System.out.println("==============> executePendingBuySell ::   REQUEST is " + httpRequest  + " <==============");
    	
    	if ( httpRequest.getSession(false) != null ) {
    		System.out.println("$$$$ Inside If Condition $$$ " + httpRequest.getSession().getId() );
    	}
    	
    	System.out.println("@Before TxnBuySellAspect::placePendingBuySell Aspect Invoked : in ExecutePendingBuySell called");
    }
    
    
}
