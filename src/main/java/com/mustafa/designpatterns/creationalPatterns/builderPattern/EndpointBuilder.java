package com.mustafa.designpatterns.creationalPatterns.builderPattern;

public class EndpointBuilder {
    private static final String DEFAULT_DELIMITER = "/";
    private final StringBuilder sbUrl = new StringBuilder();
    private final StringBuilder sbParams = new StringBuilder();
    private String baseUrl;

    public EndpointBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public EndpointBuilder append(String value) {
        sbUrl.append(value);
        sbUrl.append(DEFAULT_DELIMITER);
        return this;
    }

    public EndpointBuilder appendParam(String name, String value) {
        sbParams.append(name).append("=").append(value).append("&");
        return this;
    }

    public String build() {
        if (getBaseUrl().endsWith(DEFAULT_DELIMITER)) {
            sbUrl.insert(0, getBaseUrl());
        } else {
            sbUrl.insert(0, getBaseUrl() + DEFAULT_DELIMITER);
        }

        String url = trimEnd(sbUrl.toString(), "&");

        if (sbParams.length() > 0) {
            String qParams = trimEnd(sbParams.toString(), "&");
            url = trimEnd(trimEnd(sbUrl.toString(), DEFAULT_DELIMITER), "?");

            url = url + "?" + qParams;
        }
        return trimEnd(url, DEFAULT_DELIMITER);
    }

    private String trimEnd(String name, String value) {

        if (name.endsWith(value)) {
            name = name.substring(0, name.length() - value.length());
        }

        return name;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
