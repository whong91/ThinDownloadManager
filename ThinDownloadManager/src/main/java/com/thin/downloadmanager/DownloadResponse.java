package com.thin.downloadmanager;

import java.util.List;
import java.util.Map;

public class DownloadResponse {

    private Map<String, List<String>> responseHeaderMap;

    private String contentType;

    private String contentLength;

    private String contentDisposition;

    public DownloadResponse(Map<String, List<String>> responseHeaderMap) {
        this.responseHeaderMap = responseHeaderMap;

        if(responseHeaderMap == null){
            return;
        }

        contentType = getValuesFromResponseHeaderMap("Content-Type");
        contentLength = getValuesFromResponseHeaderMap("Content-Length");
        contentDisposition = getValuesFromResponseHeaderMap("Content-disposition");
    }

    public Map<String, List<String>> getResponseHeaderMap() {
        return responseHeaderMap;
    }

    public void setResponseHeaderMap(Map<String, List<String>> responseHeaderMap) {
        this.responseHeaderMap = responseHeaderMap;
    }

    public String getContentType() {
        return contentType;
    }

    public String getContentLength() {
        return contentLength;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    private String getValuesFromResponseHeaderMap(String key){
        List<String> responseHeaderValues = responseHeaderMap.get(key);

        if(responseHeaderValues != null && !responseHeaderValues.isEmpty()){
            return responseHeaderValues.get(0);
        }

        return null;
    }

    @Override
    public String toString() {
        return "DownloadResponse{" +
                "responseHeaderMap=" + responseHeaderMap +
                ", contentType='" + contentType + '\'' +
                ", contentLength='" + contentLength + '\'' +
                ", contentDisposition='" + contentDisposition + '\'' +
                '}';
    }
}
