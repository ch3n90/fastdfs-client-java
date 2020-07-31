package com.milchstrabe.fastdfs.client.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@ConfigurationProperties(prefix = FastdfsHttpProperties.FASTDFS_PREFIX )
public class FastdfsHttpProperties {
    private static final Logger logger = LoggerFactory.getLogger(FastdfsPoolProperties.class);
    public static final String FASTDFS_PREFIX = "spring.fastdfs.http";

    private Integer httpPort;
    private Boolean httpToken;
    private String httpSecretKey;

    public FastdfsHttpProperties() {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("default.properties");
            httpToken = Boolean.parseBoolean(properties.getProperty("fastdfs.http_anti_steal_token"));
            httpPort = Integer.parseInt(properties.getProperty("fastdfs.http_tracker_http_port"));
            httpSecretKey = properties.getProperty("fastdfs.http_secret_key");
        } catch (IOException e) {
            logger.error("load default properties fail");
        }
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public Boolean getHttpToken() {
        return httpToken;
    }

    public void setHttpToken(Boolean httpToken) {
        this.httpToken = httpToken;
    }

    public String getHttpSecretKey() {
        return httpSecretKey;
    }

    public void setHttpSecretKey(String httpSecretKey) {
        this.httpSecretKey = httpSecretKey;
    }
}
