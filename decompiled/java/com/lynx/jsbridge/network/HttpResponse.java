package com.lynx.jsbridge.network;

import com.lynx.react.bridge.JavaOnlyMap;

/* JADX INFO: loaded from: classes21.dex */
public class HttpResponse {
    public int LIZ = 200;
    public String LIZIZ = "OK";
    public String LIZJ = "";
    public final JavaOnlyMap LIZLLL = new JavaOnlyMap();
    public byte[] LJ = new byte[0];
    public final JavaOnlyMap LJFF = new JavaOnlyMap();

    public JavaOnlyMap getCustomInfo() {
        return this.LJFF;
    }

    public byte[] getHttpBody() {
        return this.LJ;
    }

    public JavaOnlyMap getHttpHeaders() {
        return this.LIZLLL;
    }

    public int getStatusCode() {
        return this.LIZ;
    }

    public String getStatusText() {
        return this.LIZIZ;
    }

    public String getUrl() {
        return this.LIZJ;
    }
}
