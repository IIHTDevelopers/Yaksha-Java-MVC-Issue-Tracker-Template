package com.yaksha.training.issuetrack.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.issuetrack.entity.Issue;
import com.yaksha.training.issuetrack.enums.Status;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/issue", "/" })
public class IssueController {

	@RequestMapping(value = { "/list", "/", "/search" })
	public String listIssues(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@RequestParam(value = "status", required = false) String status,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveIssue")
	public String saveIssue(@Valid @ModelAttribute("issue") Issue theIssue, BindingResult bindingResult,
			Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("issueId") Long issueId, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("issueId") Long issueId, Model theModel) {
		// write your logic here
		return "";
	}

	@RequestMapping("/updateStatus")
	public String updateStatus(@RequestParam("status") Status status, @RequestParam("id") Long id, Model theModel) {
		// write your logic here
		return "";
	}
}
