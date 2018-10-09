package com.acme.renewal;

import java.lang.String;

public class Driver {
	private int age;
	private String gender;
	private String maritalStatus;
	private String livingArea;
	private boolean isPrincipalOperator;
	private boolean isOwner;
	private boolean isAwayToSchool;
	private boolean isNewClient;

	/*
	public Driver(String gender, String maritalStatus, String livingArea,
			int age, boolean isPrincipalOperator, boolean isOwner,
			boolean isAwayToSchool, boolean isNewClient) {
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.livingArea = livingArea;
		this.age = age;
		this.isPrincipalOperator = isPrincipalOperator;
		this.isOwner = isOwner;
		this.isAwayToSchool = isAwayToSchool;
		this.isNewClient = isNewClient;
	}
	*/

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setLivingArea(String livingArea) {
		this.livingArea = livingArea;
	}

	public void setPrincipalOperator(boolean isPrincipalOperator) {
		this.isPrincipalOperator = isPrincipalOperator;
	}

	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}

	public void setAwayToSchool(boolean isAwayToSchool) {
		this.isAwayToSchool = isAwayToSchool;
	}

	public void setNewClient(boolean isNewClient) {
		this.isNewClient = isNewClient;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public boolean isPrincipalOperator() {
		return isPrincipalOperator;
	}

	public boolean isOwner() {
		return isOwner;
	}

	public boolean isAwayToSchool() {
		return isAwayToSchool;
	}

	public String getLivingArea() {
		return livingArea;
	}

	public String getGender() {
		return gender;
	}

	public boolean isNewClient() {
		return isNewClient;
	}

	@Override
	public String toString() {
		return gender + ", living in a " + livingArea + " area";
	}

}
