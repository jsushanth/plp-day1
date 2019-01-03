package com.cg.oicr.bean;

public class Claim {
	private int claim_number;
	private String claim_Reason;
	private String accident_Location_Street;
	private String accident_City;
	private String accident_State;
	private int accident_Zip;
	private String claim_Type;
	public int getClaim_number() {
		return claim_number;
	}
	public void setClaim_number(int claim_number) {
		this.claim_number = claim_number;
	}
	public String getClaim_Reason() {
		return claim_Reason;
	}
	public void setClaim_Reason(String claim_Reason) {
		this.claim_Reason = claim_Reason;
	}
	public String getAccident_Location_Street() {
		return accident_Location_Street;
	}
	public void setAccident_Location_Street(String accident_Location_Street) {
		this.accident_Location_Street = accident_Location_Street;
	}
	public String getAccident_City() {
		return accident_City;
	}
	public void setAccident_City(String accident_City) {
		this.accident_City = accident_City;
	}
	public String getAccident_State() {
		return accident_State;
	}
	public void setAccident_State(String accident_State) {
		this.accident_State = accident_State;
	}
	public int getAccident_Zip() {
		return accident_Zip;
	}
	public void setAccident_Zip(int accident_Zip) {
		this.accident_Zip = accident_Zip;
	}
	public String getClaim_Type() {
		return claim_Type;
	}
	public void setClaim_Type(String claim_Type) {
		this.claim_Type = claim_Type;
	}
	
	

}
