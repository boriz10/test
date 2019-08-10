package com.test.testrail.service;

import com.test.testrail.api.APIClient;
import com.test.testrail.api.APIException;
import com.test.testrail.config.ConfigHolder;
import com.test.testrail.service.model.Run;
import com.test.testrail.utils.EndPoints;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RUNS
 * <p>
 * http://docs.gurock.com/testrail-api2/reference-runs
 */
public class RunService {

    private final static Logger logger = Logger.getLogger(ResultService.class);

    private APIClient apiClient;
    public Run run;

    public RunService(APIClient apiClient) {
        this.apiClient = apiClient;
        run = new Run();
    }

    public void createTestRun(String name) throws IOException, APIException {
        createTestRun(name, new ArrayList<>());
    }

    public void createTestRun(String name, Integer suiteId, List<String> manuallyAddedCases) throws IOException, APIException {
        run.setSuite_id(suiteId);
        createTestRun(name, manuallyAddedCases);
    }

    public void createTestRun(String name, List<String> manuallyAddedCases) throws IOException, APIException {
        run.setName(name);
        createTestRun(getTestRunParamsMap(manuallyAddedCases));
    }

    private void createTestRun(Object testRunParams) throws IOException, APIException {
        logger.info("create test run");
        JSONObject testRunResponse = (JSONObject) apiClient.sendPost(EndPoints.ADD_RUN + ConfigHolder.getConfiguration().getProjectId(), testRunParams);
        run = new ObjectMapper().readValue(testRunResponse.toJSONString(), Run.class);
    }

    public void updateTestRun(Integer runId, Object testRunParams) throws IOException, APIException {
        logger.info("update test run");
        JSONObject testRunResponse = (JSONObject) apiClient.sendPost(EndPoints.UPDATE_RUN + "/" + runId, testRunParams);
        run = new ObjectMapper().readValue(testRunResponse.toJSONString(), Run.class);
    }

    @SuppressWarnings("unchecked")
    private Map getTestRunParamsMap(List<String> manuallyAddedCases) {
        Map data = new HashMap() {{
            put("name", run.getName());
        }};
        data.put("include_all", false);
        data.put("case_ids", manuallyAddedCases);
        if (run.getSuite_id() != null) {
            data.put("suite_id", run.getSuite_id());
        }
        return data;
    }
}
