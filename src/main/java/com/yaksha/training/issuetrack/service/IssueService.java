package com.yaksha.training.issuetrack.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.issuetrack.entity.Issue;
import com.yaksha.training.issuetrack.enums.Status;

@Service
public class IssueService {

	public List<Issue> getIssues() {
		// write your logic here
		return null;
	}

	public Issue saveIssue(Issue theIssue) {
		// write your logic here
		return null;
	}

	public Issue getIssue(Long issueId) {
		// write your logic here
		return null;
	}

	public boolean deleteIssue(Issue issue) {
		// write your logic here
		return false;
	}

	public boolean updateStatus(Status status, Long id) {
		// write your logic here
		return false;
	}

	public Page<Issue> searchIssues(String searchKey, String status, Pageable pageable) {
		// write your logic here
		return null;
	}

}
