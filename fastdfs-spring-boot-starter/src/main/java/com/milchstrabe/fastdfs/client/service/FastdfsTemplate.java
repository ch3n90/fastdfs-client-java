package com.milchstrabe.fastdfs.client.service;

import com.milchstrabe.fastdfs.client.common.MyException;
import com.milchstrabe.fastdfs.client.common.NameValuePair;
import com.milchstrabe.fastdfs.client.common.UploadResult;
import com.milchstrabe.fastdfs.client.fastdfs.DownloadCallback;
import com.milchstrabe.fastdfs.client.fastdfs.UploadCallback;

import java.io.IOException;

public interface FastdfsTemplate {
    UploadResult upload_file(String local_filename, String file_ext_name,
                             NameValuePair[] meta_list);

    UploadResult upload_file(byte[] file_buff, int offset, int length, String file_ext_name,
                         NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, byte[] file_buff, int offset, int length,
                         String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_file(byte[] file_buff, String file_ext_name,
                         NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, byte[] file_buff,
                         String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, long file_size, UploadCallback callback,
                         String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, String master_filename, String prefix_name,
                         String local_filename, String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, String master_filename, String prefix_name,
                         byte[] file_buff, String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, String master_filename, String prefix_name,
                         byte[] file_buff, int offset, int length, String file_ext_name,
                         NameValuePair[] meta_list);

    UploadResult upload_file(String group_name, String master_filename,
                         String prefix_name, long file_size, UploadCallback callback,
                         String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_appender_file(String local_filename, String file_ext_name,
                                  NameValuePair[] meta_list);

    UploadResult upload_appender_file(byte[] file_buff, int offset, int length, String file_ext_name,
                                  NameValuePair[] meta_list);

    UploadResult upload_appender_file(String group_name, byte[] file_buff, int offset, int length,
                                  String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_appender_file(byte[] file_buff, String file_ext_name,
                                  NameValuePair[] meta_list);

    UploadResult upload_appender_file(String group_name, byte[] file_buff,
                                  String file_ext_name, NameValuePair[] meta_list);

    UploadResult upload_appender_file(String group_name, long file_size, UploadCallback callback,
                                  String file_ext_name, NameValuePair[] meta_list);

    UploadResult append_file(String group_name, String appender_filename, String local_filename);

    UploadResult append_file(String group_name, String appender_filename, byte[] file_buff);

    UploadResult append_file(String group_name, String appender_filename,
                    byte[] file_buff, int offset, int length);

    UploadResult append_file(String group_name, String appender_filename,
                    long file_size, UploadCallback callback);

    UploadResult modify_file(String group_name, String appender_filename,
                    long file_offset, String local_filename);

    UploadResult modify_file(String group_name, String appender_filename,
                    long file_offset, byte[] file_buff);

    UploadResult modify_file(String group_name, String appender_filename,
                    long file_offset, byte[] file_buff, int buffer_offset, int buffer_length);

    UploadResult modify_file(String group_name, String appender_filename,
                    long file_offset, long modify_size, UploadCallback callback);

    UploadResult regenerate_appender_filename(String group_name, String appender_filename);

    UploadResult delete_file(String group_name, String remote_filename);

    UploadResult truncate_file(String group_name, String appender_filename);

    UploadResult truncate_file(String group_name, String appender_filename,
                      long truncated_file_size);

    byte[] download_file(String group_name, String remote_filename) throws MyException, IOException;

    byte[] download_file(String group_name, String remote_filename, long file_offset, long download_bytes) throws IOException, MyException;

    UploadResult download_file(String group_name, String remote_filename,
                      String local_filename);

    UploadResult download_file(String group_name, String remote_filename,
                      long file_offset, long download_bytes,
                      String local_filename);

    UploadResult download_file(String group_name, String remote_filename,
                      DownloadCallback callback);

    UploadResult download_file(String group_name, String remote_filename,
                      long file_offset, long download_bytes,
                      DownloadCallback callback);

}
