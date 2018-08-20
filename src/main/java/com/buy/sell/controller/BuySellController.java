package com.buy.sell.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buy.sell.service.BuySellService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/buysell")
@Slf4j
public class BuySellController {

	@Autowired
	BuySellService buySellService;
	
	@Autowired
	HttpServletRequest req;
	
	@RequestMapping(value = "/print", method = RequestMethod.GET, produces = "application/json")
  
    public String print() {
   // public String print(HttpServletRequest req) {
    	System.out.println("==============>BuySellController ::   REQUEST is " + req );
    	
    	System.out.println("Session Id is  @@@@@ " + req.getSession().getId());
    
    	buySellService.performBuySell();
    	 
         String time = new java.util.Date().toString();
    	//buySellService.writeToTips();
         //System.out.println("Killing session now ");
         
         //req.getSession().invalidate();
         
         
         
    	return "{key :" +  time+ "}";
    }
	
}
