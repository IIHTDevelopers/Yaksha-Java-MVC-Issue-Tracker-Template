package com.yaksha.training.issuetrack.entity;

import java.sql.Date;

import com.yaksha.training.issuetrack.enums.Status;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Issue {

	private Long id;

	private String issueTitle;

	private String issueDesc;

	private Date filingDate;

	private String owner;

	@Enumerated(EnumType.STRING)
	private Status status = Status.OPEN;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIssueTitle() {
		return issueTitle;
	}

	public void setIssueTitle(String issueTitle) {
		this.issueTitle = issueTitle;
	}

	public String getIssueDesc() {
		return issueDesc;
	}

	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}

	public Date getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(Date filingDate) {
		this.filingDate = filingDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
