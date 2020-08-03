package com.milchstrabe.fastdfs.client.service;

import com.milchstrabe.fastdfs.client.common.MyException;
import com.milchstrabe.fastdfs.client.common.NameValuePair;
import com.milchstrabe.fastdfs.client.common.UploadResult;
import com.milchstrabe.fastdfs.client.fastdfs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Default fastdfs client impl
 * @author ch3ng
 * @since 1.0
 **/
public class DefaultFastdfsTemplate implements FastdfsTemplate {
    private static final Logger logger = LoggerFactory.getLogger(DefaultFastdfsTemplate.class);

    @Override
    public UploadResult upload_file(String local_filename, String file_ext_name, NameValuePair[] meta_list){
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(local_filename, file_ext_name, meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(byte[] file_buff, int offset, int length, String file_ext_name, NameValuePair[] meta_list) {
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(file_buff,offset,length,file_ext_name, meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, byte[] file_buff, int offset, int length, String file_ext_name, NameValuePair[] meta_list) {
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,file_buff,offset,length,file_ext_name, meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list) {
        try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(file_buff,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,file_buff,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, long file_size, UploadCallback callback, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,file_size,callback,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, String master_filename, String prefix_name, String local_filename, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,master_filename,prefix_name,local_filename,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,master_filename,prefix_name,file_buff,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff, int offset, int length, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,master_filename,prefix_name,file_buff,offset,length,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_file(String group_name, String master_filename, String prefix_name, long file_size, UploadCallback callback, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_file(group_name,master_filename,prefix_name,file_size,callback,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_appender_file(String local_filename, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file(local_filename,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_appender_file(byte[] file_buff, int offset, int length, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file(file_buff,offset,length,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_appender_file(String group_name, byte[] file_buff, int offset, int length, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file(group_name,file_buff,offset,length,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_appender_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file(file_buff,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_appender_file(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file(group_name,file_buff,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult upload_appender_file(String group_name, long file_size, UploadCallback callback, String file_ext_name, NameValuePair[] meta_list) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.upload_appender_file(group_name,file_size,callback,file_ext_name,meta_list);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult append_file(String group_name, String appender_filename, String local_filename) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.append_file(group_name,appender_filename,local_filename);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult append_file(String group_name, String appender_filename, byte[] file_buff) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.append_file(group_name,appender_filename,file_buff);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult append_file(String group_name, String appender_filename, byte[] file_buff, int offset, int length) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.append_file(group_name,appender_filename,file_buff,offset,length);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult append_file(String group_name, String appender_filename, long file_size, UploadCallback callback) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.append_file(group_name,appender_filename,file_size,callback);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult modify_file(String group_name, String appender_filename, long file_offset, String local_filename) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.modify_file(group_name,appender_filename,file_offset,local_filename);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.modify_file(group_name,appender_filename,file_offset,file_buff);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff, int buffer_offset, int buffer_length) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.modify_file(group_name,appender_filename,file_offset,file_buff,buffer_offset,buffer_length);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult modify_file(String group_name, String appender_filename, long file_offset, long modify_size, UploadCallback callback) {
          try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.modify_file(group_name,appender_filename,file_offset,modify_size,callback);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult regenerate_appender_filename(String group_name, String appender_filename) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            String[] result = storageClient.regenerate_appender_filename(group_name,appender_filename);
            return UploadResult.builder().isSuccess(true).msg("success").path(result[0]+"/"+result[1]);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult delete_file(String group_name, String remote_filename) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.delete_file(group_name,remote_filename);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+remote_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult truncate_file(String group_name, String appender_filename) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.truncate_file(group_name, appender_filename);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult truncate_file(String group_name, String appender_filename, long truncated_file_size) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.truncate_file(group_name,appender_filename,truncated_file_size);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+appender_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public byte[] download_file(String group_name, String remote_filename) throws MyException, IOException {
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getTrackerServer();
        StorageClient storageClient = new StorageClient(trackerServer);
        return storageClient.download_file(group_name,remote_filename);
    }

    @Override
    public byte[] download_file(String group_name, String remote_filename, long file_offset, long download_bytes) throws IOException, MyException {
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getTrackerServer();
        StorageClient storageClient = new StorageClient(trackerServer);
        return storageClient.download_file(group_name,remote_filename,file_offset,download_bytes);
    }

    @Override
    public UploadResult download_file(String group_name, String remote_filename, String local_filename) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.download_file(group_name,remote_filename,local_filename);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+remote_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult download_file(String group_name, String remote_filename, long file_offset, long download_bytes, String local_filename) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
             int isO = storageClient.download_file(group_name,remote_filename,file_offset,download_bytes,local_filename);
             return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+remote_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult download_file(String group_name, String remote_filename, DownloadCallback callback) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
             int isO = storageClient.download_file(group_name,remote_filename,callback);
             return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+remote_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

    @Override
    public UploadResult download_file(String group_name, String remote_filename, long file_offset, long download_bytes, DownloadCallback callback) {
         try {
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer);
            int isO = storageClient.download_file(group_name,remote_filename,file_offset,download_bytes,callback);
            return UploadResult.builder().isSuccess(isO == 0 ? true : false).msg(isO+"").path(group_name + "/"+remote_filename);
        } catch (IOException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        } catch (MyException e) {
            logger.error("upload file fail:{}",e.getMessage());
            return UploadResult.builder().isSuccess(false).msg(e.getMessage());
        }
    }

}
