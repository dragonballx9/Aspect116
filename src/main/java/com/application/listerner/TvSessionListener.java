package com.application.listerner;

import javax.servlet.http.HttpSessionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.HttpSessionMutexListener;

import com.buy.sell.service.BuySellTipsDto;


@Component
public class TvSessionListener extends HttpSessionMutexListener{
	
	@Autowired
	BuySellTipsDto tipsDto;
	
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		//super.sessionDestroyed(event);
		 String time = new java.util.Date().toString();
		 
		System.out.println(time + " @@@@@@@@@@@@@@@ sessionDestroyed @@@@@@@@@@@@@@@"+ event.getSession().getId());
		tipsDto.executePendingBuySell();
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		
		super.sessionCreated(event);
		
		String time = new java.util.Date().toString();
		System.out.println(time + " ################ sessionCreated #############" + event.getSession().getId());
	}

}
