package com.demoReportingAndAnalytics;

import java.util.HashMap;
import java.util.Map;

import com.demoReportingAndAnalytics.LoginAction;

public class ReportingAndAnalyticsRepository {
	
	private static Map<String,LoginAction> map = new HashMap<String,LoginAction>(); 
	public ReportingAndAnalyticsRepository(){
		map.put("111", new LoginAction(111, "ABC"));
		map.put("222", new LoginAction(222, "EFG"));
		map.put("333", new LoginAction(333, "XYZ"));
	}
	public  LoginAction getLoginActionById(String id){
		return map.get(id);
	}
	public  Map<String,LoginAction> findAllLogin(){
		return map;
	}

}
