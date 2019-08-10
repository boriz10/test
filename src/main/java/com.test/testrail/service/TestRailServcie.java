package com.test.testrail.service;

import com.test.testrail.api.APIClient;
import com.test.testrail.config.ConfigHolder;
import com.test.testrail.config.model.Configuration;
import org.apache.log4j.Logger;

public class TestRailServcie {

    private final static Logger logger = Logger.getLogger(TestRailServcie.class);

    public ResultService resultsService;
    public RunService runService;
    public TestsService testsService;

    public TestRailServcie(APIClient client) {
        initServices(client);
    }

    public TestRailServcie(){
        logger.info("get testRail configuration");
        Configuration configuration = ConfigHolder.getConfiguration();
        APIClient client = new APIClient(configuration.getBaseUrl(), configuration.getUsername(), configuration.getPassword());
        initServices(client);
    }

    private void initServices(APIClient apiClient) {
        logger.info("init testRail services with APIClient");
        resultsService = new ResultService(apiClient);
        runService = new RunService(apiClient);
        testsService = new TestsService(apiClient);
    }

}
