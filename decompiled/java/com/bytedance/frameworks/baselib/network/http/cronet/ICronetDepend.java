package com.bytedance.frameworks.baselib.network.http.cronet;

/* JADX INFO: loaded from: classes24.dex */
public interface ICronetDepend {
    String getSsCookieKey();

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void setAdapter(ICronetDepend iCronetDepend);
}
