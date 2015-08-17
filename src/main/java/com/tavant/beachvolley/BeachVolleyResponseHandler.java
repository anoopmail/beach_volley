package com.tavant.beachvolley;

/**
 * Response callback handler
 */
public class BeachVolleyResponseHandler<T> {
    /**
     * Notifies about success
     * @param data returned data
     * @param response http response object
     */
    public void success(T data){}

    /**
     * Notifies about error (http response code >= 400)
     * @param message error message
     * @param response http response object
     */
    public void error(String message){}

    /**
     * Notifies about network failure (offline, authentication error, etc.)
     * @param error
     */


    /**
     * Notifies about request complete (happens after success/error/failure)
     */
    public void complete(){}
}