package com.example;

import javax.net.ssl.SSLContext;

public class TLSCheck {
    public static void main(String[] args) throws Exception {
        SSLContext context = SSLContext.getDefault();
        for (String protocol : context.getSupportedSSLParameters().getProtocols()) {
            System.out.println(protocol);
        }
    }
}
