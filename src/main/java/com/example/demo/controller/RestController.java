package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.CommonResponse;
import com.example.demo.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("restapi")
public class RestController {

    @Autowired
    RestService restService;
    @Autowired
    CommonResponse responseService;

    @PostMapping(value = "/getCustomerInfo", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CommonResponseModel> getCustomerInfo(@RequestBody RequestModel model) {
        CustomerModel customerModel = new CustomerModel();
        customerModel = restService.getCustomerInfo();

        if (customerModel != null) {
            return responseService.prepareSuccessResponseObject(customerModel);
        }
        return responseService.prepareFailedResponse("customerModel");

    }

    @PostMapping(value = "/getAccountInfo", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CommonResponseModel> getAccountInfo(@RequestBody RequestModel model) {
        AccountModel accountModel = new AccountModel();
        accountModel = restService.getAccountInfo();

        if (accountModel != null) {
            return responseService.prepareSuccessResponseObject(accountModel);
        }
        return responseService.prepareFailedResponse("accountModel");

    }

    @PostMapping(value = "/getCardInfo", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CommonResponseModel> getCardInfo(@RequestBody RequestModel model) {
        CardModel cardModel = new CardModel();
        cardModel = restService.getCardInfo();

        if (cardModel != null) {
            return responseService.prepareSuccessResponseObject(cardModel);
        }
        return responseService.prepareFailedResponse("cardModel");

    }

    @PostMapping(value = "/getMasterInfo", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CommonResponseModel> getMasterInfo(@RequestBody RequestModel model) {
        MasterModel masterModel = new MasterModel();
        masterModel = restService.getMasterInfo();

        if (masterModel != null) {
            return responseService.prepareSuccessResponseObject(masterModel);
        }
        return responseService.prepareFailedResponse("masterModel");

    }
}
