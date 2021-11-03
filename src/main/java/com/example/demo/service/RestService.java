package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    // basic service
    public CustomerModel getCustomerInfo() {
        CustomerModel customerModel = new CustomerModel();

        customerModel.setCustomerNumber("12345");
        customerModel.setCustomerFirstName("JOHN");
        customerModel.setCustomerLastName("SMITH");
        customerModel.setCustomerAddress("REDUIT");

        return customerModel;
    }

    // basic service
    public AccountModel getAccountInfo() {
        AccountModel accountModel = new AccountModel();

        accountModel.setAccountNumber("0000123456789");
        accountModel.setAccountDescription("JOHN SMITH");
        accountModel.setAccountCategory("CURRENT");
        accountModel.setAccountRestriction("NO DEBIT");

        return accountModel;
    }

    // basic service
    public CardModel getCardInfo() {
        CardModel cardModel = new CardModel();

        cardModel.setCardNumber("5511 2233 4455 6677");
        cardModel.setCardAccountNumber("0000123456789");
        cardModel.setCardType("VISA");
        cardModel.setCardExpiryDate("04/25");

        return cardModel;
    }

    // composite service
    public MasterModel getMasterInfo() {
        MasterModel masterModel = new MasterModel();

        CustomerModel customerModel = new CustomerModel();
        AccountModel accountModel = new AccountModel();
        CardModel cardModel = new CardModel();

        customerModel = getCustomerInfo();
        accountModel = getAccountInfo();
        cardModel = getCardInfo();

        masterModel.setCustomerNumber(customerModel.getCustomerNumber());


        return masterModel;
    }
}
