package com.acme.renewal;

/**
 * @author pberland@us.ibm.com
 *
 */
public class Application {
	private boolean isEligible;
	private double price;
	private String primaryClassCode;
	private boolean isYouthful;
	private double costFactor;
	private double claimCostSurcharge;
	private int claimCost;

	public boolean isEligible() {
		return isEligible;
	}

	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	public double getClaimCostSurcharge() {
		return claimCostSurcharge;
	}

	public void setClaimCostSurcharge(double claimCostSurcharge) {
		this.claimCostSurcharge = claimCostSurcharge;
	}

	public int getClaimCost() {
		return claimCost;
	}

	public void setClaimCost(int claimCost) {
		this.claimCost = claimCost;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPrimaryClassCode() {
		return primaryClassCode;
	}

	public void setPrimaryClassCode(String primaryClassCode) {
		this.primaryClassCode = primaryClassCode;
	}

	public boolean isYouthful() {
		return isYouthful;
	}

	public void setYouthful(boolean isYouthful) {
		this.isYouthful = isYouthful;
	}

	public double getCostFactor() {
		return costFactor;
	}

	public void setCostFactor(double costFactor) {
		this.costFactor = costFactor;
	}
}
