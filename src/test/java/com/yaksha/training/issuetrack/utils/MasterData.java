package com.yaksha.training.issuetrack.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.yaksha.training.issuetrack.entity.Issue;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MasterData {

    public static Issue getIssue() {
        Issue issue = new Issue();
        issue.setId(1L);
        issue.setIssueTitle(randomStringWithSize(10));
        issue.setIssueDesc(randomStringWithSize(10));
        issue.setOwner(randomStringWithSize(20));
        issue.setFilingDate(Date.valueOf(LocalDate.now().toString()));
        return issue;
    }

    public static List<Issue> getIssueList(int size) {
        Long id = 0L;
        List<Issue> issues = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Issue issue = new Issue();
            issue.setId(1L);
            issue.setIssueTitle(randomStringWithSize(10));
            issue.setIssueDesc(randomStringWithSize(10));
            issue.setOwner(randomStringWithSize(20));
            issue.setFilingDate(Date.valueOf(LocalDate.now().toString()));
            issues.add(issue);
        }
        return issues;
    }


    private static Random rnd = new Random();

    public static String randomStringWithSize(int size) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + (String.valueOf(alphabet.charAt(rnd.nextInt(alphabet.length()))));
        }
        return s;
    }

    public static boolean randomBoolean() {
        String alphabet = "1234567890";
        Random rnd = new Random();
        return rnd.nextInt(alphabet.length()) % 2 == 0;
    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            final String jsonContent = mapper.writeValueAsString(obj);

            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
