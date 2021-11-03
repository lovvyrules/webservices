package com.example.demo.model;

public class AccountModel {
    private String accountNumber;
    private String accountDescription;
    private String accountCategory;
    private String accountRestriction;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    public String getAccountRestriction() {
        return accountRestriction;
    }

    public void setAccountRestriction(String accountRestriction) {
        this.accountRestriction = accountRestriction;
    }
}
