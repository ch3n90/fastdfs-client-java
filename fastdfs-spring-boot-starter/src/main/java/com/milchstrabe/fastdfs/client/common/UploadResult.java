package com.milchstrabe.fastdfs.client.common;

/**
 * @Author ch3ng
 * @Date 2020/7/31 10:46
 * @Version 1.0
 * @Description
 **/
public class UploadResult {

    private boolean isSuccess;
    private String msg;
    private String path;

    private UploadResult(){}

    public static UploadResult builder(){
        return new UploadResult();
    }

    public UploadResult isSuccess(boolean isSuccess){
        this.isSuccess = isSuccess;
        return this;
    }


    public UploadResult msg(String msg){
        this.msg = msg;
        return this;
    }


    public UploadResult path(String path){
        this.path = path;
        return this;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public String getMsg() {
        return msg;
    }

    public String getPath() {
        return path;
    }
}
