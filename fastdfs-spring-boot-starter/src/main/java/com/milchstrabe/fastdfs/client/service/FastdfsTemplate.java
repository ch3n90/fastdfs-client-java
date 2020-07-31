package com.milchstrabe.fastdfs.client.service;

import com.milchstrabe.fastdfs.client.common.MyException;
import com.milchstrabe.fastdfs.client.common.NameValuePair;
import com.milchstrabe.fastdfs.client.common.UploadResponse;
import com.milchstrabe.fastdfs.client.fastdfs.StorageClient;
import com.milchstrabe.fastdfs.client.fastdfs.TrackerClient;
import com.milchstrabe.fastdfs.client.fastdfs.TrackerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author ch3ng
 * @Date 2020/7/31 10:44
 * @Version 1.0
 * @Description
 **/
@Component
public class FastdfsTemplate {
    private static final Logger logger = LoggerFactory.getLogger(FastdfsTemplate.class);


    public UploadResponse uploadFile(String sourceFile) throws IOException {
       return this.upload_file(sourceFile, null, null);
    }


    public UploadResponse uploadFile(String sourceFile,String fileExtName) throws IOException {
        return this.upload_file(sourceFile, fileExtName, null);
    }

    public UploadResponse uploadFile(String sourceFile,String fileExtName,NameValuePair[] nameValuePairs) throws IOException {
        return this.upload_file(sourceFile, fileExtName, nameValuePairs);
    }


    public UploadResponse uploadFileWithSmallFile(byte[] bytes) throws IOException {
        return this.upload_file(bytes, null, null);
    }


    public UploadResponse uploadFileWithSmallFile(byte[] bytes,String fileExtName) throws IOException {
        return this.upload_file(bytes, fileExtName, null);
    }

    public UploadResponse uploadFileWithSmallFile(byte[] bytes,String fileExtName,NameValuePair[] nameValuePairs) throws IOException {
        return this.upload_file(bytes, fileExtName, nameValuePairs);
    }

    public UploadResponse uploadFileWithSmallFile(byte[] bytes,NameValuePair[] nameValuePairs,String group) throws IOException {
        return this.upload_file(bytes,group,null, nameValuePairs);
    }
    public UploadResponse uploadFileWithSmallFile(byte[] bytes,String fileExtName,String group) throws IOException {
        return this.upload_file(bytes,group,fileExtName, null);
    }

    public UploadResponse uploadFileWithSmallFile(byte[] bytes,String fileExtName,NameValuePair[] nameValuePairs,String group) throws IOException {
        return this.upload_file(bytes,group,fileExtName, nameValuePairs);
    }


    protected UploadResponse upload_file(byte[] bytes,String fileExtName,NameValuePair[] metas){
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(bytes, fileExtName, metas);
            return UploadResponse.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    protected UploadResponse upload_filez(String sourceFile, String FileExtName, NameValuePair[] nameValuePairs){
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file()
            return UploadResponse.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("source file fail:{}",e.getMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getLocalizedMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    protected UploadResponse upload_file(String sourceFile, String FileExtName, NameValuePair[] nameValuePairs){
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(sourceFile, FileExtName, nameValuePairs);
            return UploadResponse.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("source file fail:{}",e.getMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getLocalizedMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        }
    }
    protected UploadResponse upload_file(byte[] bytes,String group, String FileExtName, NameValuePair[] nameValuePairs){
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group,bytes, FileExtName, nameValuePairs);
            return UploadResponse.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("source file fail:{}",e.getMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getLocalizedMessage());
            return UploadResponse.builder().isSuccess(false).msg(e.getMessage());
        }
    }
}
