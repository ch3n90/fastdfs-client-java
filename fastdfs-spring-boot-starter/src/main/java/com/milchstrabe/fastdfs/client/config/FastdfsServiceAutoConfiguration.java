package com.milchstrabe.fastdfs.client.config;

import com.milchstrabe.fastdfs.client.common.MyException;
import com.milchstrabe.fastdfs.client.fastdfs.ClientGlobal;
import com.milchstrabe.fastdfs.client.fastdfs.TrackerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@EnableConfigurationProperties({FastdfsProperties.class,FastdfsPoolProperties.class,FastdfsHttpProperties.class})
public class FastdfsServiceAutoConfiguration {

    @Autowired
    private FastdfsProperties fastdfsProperties;
    @Autowired
    private FastdfsPoolProperties fastdfsPoolProperties;
    @Autowired
    private FastdfsHttpProperties fastdfsHttpProperties;


    @Bean
    public TrackerClient trackerClient() throws IOException, MyException {
        ClientGlobal.init(fastdfsProperties,fastdfsPoolProperties,fastdfsHttpProperties);
        TrackerClient tracker = new TrackerClient();
        return tracker;
    }


}
