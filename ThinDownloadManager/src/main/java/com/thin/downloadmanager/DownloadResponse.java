package com.thin.downloadmanager;

import java.util.List;
import java.util.Map;

public class DownloadResponse {

    private Map<String, List<String>> responseHeaderMap;

    public DownloadResponse(Map<String, List<String>> responseHeaderMap) {
        this.responseHeaderMap = responseHeaderMap;
    }

    public Map<String, List<String>> getResponseHeaderMap() {
        return responseHeaderMap;
    }

    public void setResponseHeaderMap(Map<String, List<String>> responseHeaderMap) {
        this.responseHeaderMap = responseHeaderMap;
    }
}
