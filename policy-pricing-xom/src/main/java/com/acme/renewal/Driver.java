package com.acme.renewal;

import java.lang.String;

/**
 * @author pberland@us.ibm.com
 *
 */
public class Driver {
	private int age;
	private String gender;
	private String maritalStatus;
	private String livingArea;
	private boolean isPrincipalOperator;
	private boolean isOwner;
	private boolean isAwayToSchool;
	private boolean isNewClient;

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
}
