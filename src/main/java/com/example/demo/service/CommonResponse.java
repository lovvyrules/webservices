package com.example.demo.service;

import com.example.demo.config.ApplicationConstants;
import com.example.demo.model.CommonResponseModel;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonResponse {
    /**
     * Common method for Response     *
     *
     * @param errorMessage
     * @return
     */
    public ResponseEntity<CommonResponseModel> prepareFailedResponse(String errorMessage) {
        CommonResponseModel responseObject = new CommonResponseModel();
        responseObject.setError(errorMessage);
        responseObject.setResult(ApplicationConstants.EMPTY_ARRAY);
        responseObject.setStatusCode(ApplicationConstants.FAILED_CODE);
        responseObject.setStatus(ApplicationConstants.FAILED_STATUS);
        return new ResponseEntity<CommonResponseModel>(responseObject, HttpStatus.OK);
    }

    /**
     * Common method to Success Response
     *
     * @param resultData
     * @return
     */
    public ResponseEntity<CommonResponseModel> prepareSuccessResponseObject(Object resultData) {
        CommonResponseModel responseObject = new CommonResponseModel();
        List result = new ArrayList();
        if (resultData instanceof JSONObject) {
            result.add(resultData);
        } else if (resultData instanceof JSONArray) {
            result = (List) resultData;
        } else if (resultData instanceof List) {
            result = (List) resultData;
        } else {
            result.add(resultData);
        }
        responseObject.setResult(result);
        responseObject.setStatusCode(ApplicationConstants.SUCCESS_CODE);
        responseObject.setStatus(ApplicationConstants.SUCCESS_STATUS);
        return new ResponseEntity<CommonResponseModel>(responseObject, HttpStatus.OK);
    }

}
