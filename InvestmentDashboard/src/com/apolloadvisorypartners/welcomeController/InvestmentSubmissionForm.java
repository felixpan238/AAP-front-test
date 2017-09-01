package com.apolloadvisorypartners.welcomeController;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InvestmentSubmissionForm {
	@Size(min=2,max=30)
	@NotBlank
	private String companyName;
	@NotBlank
	private String contactName;
	@NotBlank
	@Size(min=10, max=10)
	private Long contactNumber;
	@NotBlank
	private Date initiationDate;
	private String description;

	public InvestmentSubmissionForm() {

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getInitiationDate() {
		return initiationDate;
	}

	public void setInitiationDate(Date initiationDate) {
		this.initiationDate = initiationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
