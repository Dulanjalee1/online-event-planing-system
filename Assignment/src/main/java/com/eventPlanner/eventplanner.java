package com.eventPlanner;

public class eventplanner {
	private int event_Planner_id;
	private String event_Planner_name;
	private String event_Planner_email;
	private String username;
	private String Password;
	public eventplanner(int event_Planner_id, String event_Planner_name, String event_Planner_email, String username,String password) 
	{
		super();
		this.event_Planner_id = event_Planner_id;
		this.event_Planner_name = event_Planner_name;
		this.event_Planner_email = event_Planner_email;
		this.username = username;
		this.Password = password;
	}
	public int getEvent_Planner_id() {
		return event_Planner_id;
	}
	
	public String getEvent_Planner_name() {
		return event_Planner_name;
	}
	
	public String getEvent_Planner_email() {
		return event_Planner_email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	    
	
	
	

	

}
