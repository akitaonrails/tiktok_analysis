package com.lynx.jsbridge.network;

import com.lynx.react.bridge.JavaOnlyMap;

/* JADX INFO: loaded from: classes21.dex */
public class HttpRequest {
    public byte[] LIZLLL;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public JavaOnlyMap LJ = new JavaOnlyMap();
    public JavaOnlyMap LJFF = new JavaOnlyMap();

    public static HttpRequest CreateHttpRequest(String str, String str2, String str3, byte[] bArr, JavaOnlyMap javaOnlyMap, JavaOnlyMap javaOnlyMap2) {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.LIZ = str;
        httpRequest.LIZIZ = str2;
        httpRequest.LIZJ = str3;
        httpRequest.LIZLLL = bArr;
        httpRequest.LJ = javaOnlyMap;
        httpRequest.LJFF = javaOnlyMap2;
        return httpRequest;
    }
}
