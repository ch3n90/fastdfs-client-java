package com.milchstrabe.fastdfs.client.fastdfs.pool;


import com.milchstrabe.fastdfs.client.common.MyException;
import com.milchstrabe.fastdfs.client.fastdfs.ClientGlobal;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConnectionFactory {
    /**
     * create from InetSocketAddress
     *
     * @param socketAddress
     * @return
     * @throws MyException
     */
    public static Connection create(InetSocketAddress socketAddress) throws MyException {
        try {
            Socket sock = new Socket();
            sock.setReuseAddress(true);
            sock.setSoTimeout(ClientGlobal.g_network_timeout);
            sock.connect(socketAddress, ClientGlobal.g_connect_timeout);
            return new Connection(sock, socketAddress);
        } catch (Exception e) {
            throw new MyException("connect to server " + socketAddress.getAddress().getHostAddress() + ":" + socketAddress.getPort() + " fail, emsg:" + e.getMessage());
        }
    }
}
