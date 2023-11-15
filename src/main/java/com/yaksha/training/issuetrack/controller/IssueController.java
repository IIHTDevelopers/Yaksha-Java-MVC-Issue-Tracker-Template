package com.yaksha.training.issuetrack.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.issuetrack.entity.Issue;

@Controller
@RequestMapping(value = { "/issue", "/" })
public class IssueController {

	@RequestMapping(value = { "/list", "/" })
	public String listIssues(Model theModel) {
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		return "";
	}

	@PostMapping("/saveIssue")
	public String saveIssue(@Valid @ModelAttribute("issue") Issue theIssue, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("issueId") Long issueId, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("issueId") Long issueId, Model theModel) {
		return "";
	}
}
