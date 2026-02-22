package com.spring.jdbc;

public class Student {
	private int stid;
	private String stnm;
	private String city;
	
	
	public Student()
	{
		super();
	}
	
	public Student(int stid,String stnm ,String city)
	{
		super();
		this.stid = stid;
		this.stnm = stnm;
		this.city = city;
	}
	
	public int getStid()
	{
		return stid;
	}
	
	public void setStid(int stid)
	{
		this.stid = stid;
	}
	
	public String getStnm()
	{
		return stnm;
	}
	
	public void setStnm(String stnm)
	{
		this.stnm = stnm;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stnm=" + stnm + ", city=" + city + "]";
	}
	
}
