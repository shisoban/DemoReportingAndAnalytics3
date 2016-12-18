package com.demoReportingAndAnalytics;

import java.util.Map;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.demoReportingAndAnalytics.LoginAction;
import com.opensymphony.xwork2.ModelDriven;
//import com.repository.ReportingAndAnalyticsRepository;



public class ReportingAndAnalyticsController implements ModelDriven<Object> {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private Object model;
	private ReportingAndAnalyticsRepository reportingAndAnalyticsRepository = new ReportingAndAnalyticsRepository();
	private static Map<String,LoginAction> map;
	{
		map = reportingAndAnalyticsRepository.findAllLogin();
	}
	public HttpHeaders index() {
		model = map;
		return new DefaultHttpHeaders("index").disableCaching();
	}
	public String add(){
		Integer loginId = Integer.parseInt(id);
		LoginAction login = new LoginAction(loginId,"PQR");
		model = login;
		return "SUCCESS";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		model = reportingAndAnalyticsRepository.getLoginActionById(id);
		this.id = id;
	}
	@Override
	public Object getModel() {
		return model;
	}
}
