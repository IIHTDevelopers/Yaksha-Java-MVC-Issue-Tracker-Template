package com.yaksha.training.issuetrack.entity;

public class Issue {

	private Long id;

	private String bouncer;

	private String issue;

	private String filingDate;

	private String owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBouncer() {
		return bouncer;
	}

	public void setBouncer(String bouncer) {
		this.bouncer = bouncer;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(String filingDate) {
		this.filingDate = filingDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
