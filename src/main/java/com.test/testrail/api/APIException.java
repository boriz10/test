package com.test.testrail.api;

/**
 * TestRail api implementation
 * https://github.com/gurock/testrail-api/tree/master/java/com/gurock/testrail
 *
 */

public class APIException extends Exception
{
    public APIException(String message)
    {
        super(message);
    }
}