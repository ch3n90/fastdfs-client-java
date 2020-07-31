package com.milchstrabe.fastdfs.client.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@ConfigurationProperties(prefix = FastdfsProperties.FASTDFS_PREFIX )
public class FastdfsProperties {
    private static final Logger logger = LoggerFactory.getLogger(FastdfsProperties.class);

    public static final String FASTDFS_PREFIX = "spring.fastdfs";

    private Integer connectTimeout;
    private Integer networkTimeout;
    private String charset;
    private String[] trackerServer;


    public FastdfsProperties() {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("default.properties");
            connectTimeout = Integer.parseInt(properties.getProperty("fastdfs.connect_timeout_in_seconds"));
            networkTimeout = Integer.parseInt(properties.getProperty("fastdfs.network_timeout_in_seconds"));
            charset = properties.getProperty("fastdfs.charset");
        } catch (IOException e) {
           logger.error("load default properties fail");
        }
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getNetworkTimeout() {
        return networkTimeout;
    }

    public void setNetworkTimeout(Integer networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String[] getTrackerServer() {
        return trackerServer;
    }

    public void setTrackerServer(String[] trackerServer) {
        this.trackerServer = trackerServer;
    }
}
