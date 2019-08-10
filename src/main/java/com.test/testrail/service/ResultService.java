package com.test.testrail.service;

import com.test.testrail.api.APIClient;
import com.test.testrail.api.APIException;
import com.test.testrail.utils.EndPoints;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Map;

/**
 * RESULTS
 * <p>
 * http://docs.gurock.com/testrail-api2/reference-results
 */
public class ResultService {

    private final static Logger logger = Logger.getLogger(ResultService.class);

    private APIClient apiClient;

    public ResultService(APIClient apiClient) {
        this.apiClient = apiClient;
    }

    public Object addResults(Integer testId, Map data) throws IOException, APIException {
        logger.info("add result for test case");
        return apiClient.sendPost(EndPoints.ADD_RESULT + testId, data);
    }

    public Object addResultForCase(Integer runId, Integer caseId, Map data) throws IOException, APIException {
        logger.info("add result for test case. runId = " + runId + ", caseId = " + caseId);
        return apiClient.sendPost(EndPoints.ADD_RESULT_FOR_CASE + runId + "/" + caseId, data);
    }

}
