package com.snw.openClose.solution;

//base class - closed for modification
public abstract class Subscriber {
	
	protected long subscriberId;

	protected String address;

	protected long phoneNumber;
	
	protected int baseRate;

	public long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
	public int getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}

	public abstract double calculateBill(); //extension
    
}
