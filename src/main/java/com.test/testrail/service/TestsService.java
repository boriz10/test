package com.test.testrail.service;

import com.test.testrail.api.APIClient;
import com.test.testrail.api.APIException;
import com.test.testrail.service.model.Test;
import com.test.testrail.utils.EndPoints;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * TESTS
 * <p>
 * http://docs.gurock.com/testrail-api2/reference-tests
 */
public class TestsService {

    private final static Logger logger = Logger.getLogger(TestsService.class);

    private APIClient apiClient;

    public TestsService(APIClient apiClient) {
        this.apiClient = apiClient;
    }
    public List<Test> getTests(String testRunId) throws IOException, APIException {
        logger.info("get tests");
        JSONArray response = (JSONArray) apiClient.sendGet(EndPoints.GET_TESTS + testRunId);
        List<Test> testsIncludedInRun = Arrays.asList(new ObjectMapper().readValue(response.toJSONString(), Test[].class));
        return testsIncludedInRun;
    }
}