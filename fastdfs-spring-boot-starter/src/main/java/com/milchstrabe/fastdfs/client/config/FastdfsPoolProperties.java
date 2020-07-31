package com.milchstrabe.fastdfs.client.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@ConfigurationProperties(prefix = FastdfsPoolProperties.FASTDFS_PREFIX )
public class FastdfsPoolProperties {

    private static final Logger logger = LoggerFactory.getLogger(FastdfsPoolProperties.class);
    public static final String FASTDFS_PREFIX = "spring.fastdfs.pool";

    private Boolean enabled;
    private Integer maxCountPerEntry;
    private Integer maxIdleTime;
    private Integer maxWaitTimeInMs;

    public FastdfsPoolProperties() {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("default.properties");
            enabled = Boolean.parseBoolean(properties.getProperty("fastdfs.connection_pool.enabled"));
            maxCountPerEntry = Integer.parseInt(properties.getProperty("fastdfs.connection_pool.max_count_per_entry"));
            maxIdleTime = Integer.parseInt(properties.getProperty("fastdfs.connection_pool.max_idle_time"));
            maxWaitTimeInMs = Integer.parseInt(properties.getProperty("fastdfs.connection_pool.max_wait_time_in_ms"));
        } catch (IOException e) {
            logger.error("load default properties fail");
        }

    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getMaxCountPerEntry() {
        return maxCountPerEntry;
    }

    public void setMaxCountPerEntry(Integer maxCountPerEntry) {
        this.maxCountPerEntry = maxCountPerEntry;
    }

    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public Integer getMaxWaitTimeInMs() {
        return maxWaitTimeInMs;
    }

    public void setMaxWaitTimeInMs(Integer maxWaitTimeInMs) {
        this.maxWaitTimeInMs = maxWaitTimeInMs;
    }
}
