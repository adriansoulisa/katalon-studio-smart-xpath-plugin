package com.katalon.plugin.smart_xpath.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrokenTestObject {
	@SerializedName("approved")
	@Expose
	private Boolean approved;
	@SerializedName("proposedXPath")
	@Expose
	private String proposedXPath;
	@SerializedName("testObjectId")
	@Expose
	private String testObjectId;
	@SerializedName("brokenXPath")
	@Expose
	private String brokenXPath;

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public String getProposedXPath() {
		return proposedXPath;
	}

	public void setProposedXPath(String proposedXPath) {
		this.proposedXPath = proposedXPath;
	}

	public String getTestObjectId() {
		return testObjectId;
	}

	public void setTestObjectId(String testObjectId) {
		this.testObjectId = testObjectId;
	}

	public String getBrokenXPath() {
		return brokenXPath;
	}

	public void setBrokenXPath(String brokenXPath) {
		this.brokenXPath = brokenXPath;
	}
	
	@Override
	public boolean equals(Object obj){
		BrokenTestObject brokenTestObject = (BrokenTestObject) obj;
		return this.getApproved().equals(brokenTestObject.getApproved())
				&& this.getBrokenXPath().equals(brokenTestObject.getBrokenXPath())
				&& this.getProposedXPath().equals(brokenTestObject.getProposedXPath())
				&& this.getTestObjectId().equals(brokenTestObject.getTestObjectId());
	}

}