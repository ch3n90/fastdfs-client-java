# FastDFS java client
FastdDFS springboot starter 客户端

## 介绍

在原作者 [YuQing](https://github.com/happyfish100)原项目[fastdfs-client-java](https://github.com/happyfish100/fastdfs-client-java)进行简单封装

会跟进原作者项目一直持续发布，目前基于1.29封装


## maven项目pom.xml中添加依赖

```xml
<dependency>
    <groupId>com.milchstrabe.fastdfs.client</groupId>
    <artifactId>fastdfs-spring-boot-starter</artifactId>
    <version>1.0.1</version>
</dependency>
```

## 配置文件

```yaml
# 
spring:
  fastdfs:
    tracker-server: 127.0.0.1:22122,192.168.1.3:22122
    connect-timeout: 5
    network-timeout: 30
    charset: UTF-8
    http:
      http-port: 80
      http-secret-key: FastDFS1234567890
      http-token: false
    pool:
      enabled: true
      max-count-per-entry: 500
      max-idle-time: 3600
      max-wait-time-in-ms: 1000
```

## 如何使用

```java
package com.milchstrabe.fastdfs.test;

import com.milchstrabe.fastdfs.client.common.UploadResult;
import com.milchstrabe.fastdfs.client.service.FastdfsTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestFastdfsDemoApplication.class)
public class TestFastdfsApplication {

    @Autowired
    private FastdfsTemplate fastdfsTemplate;

    @Test
    public void testUploadFile() {
        UploadResult uploadResult = fastdfsTemplate.upload_file("/Users/admin/Desktop/test.py", null, null);
        System.out.println(uploadResult);
    }
}

```



## License

 FastDFS java client is under the Apache 2.0 license. See the [LICENSE](https://github.com/ch3n90/fastdfs-client-java/blob/master/LICENSE) file for details.

