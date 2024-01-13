package com.yaksha.training.issuetrack.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.issuetrack.entity.Issue;
import com.yaksha.training.issuetrack.enums.Status;

public interface IssueRepository extends JpaRepository<Issue, Long> {

	// write your logic here to add other functions

	// feel free to add logic for this
	Page<Issue> findByIssueTitleDescOwnerAndStatus(@Param("keyword") String keyword, @Param("status") Status status,
			Pageable pageable);

}
