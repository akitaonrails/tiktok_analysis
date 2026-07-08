package com.ss.lyrax.engine;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxBaseContextOption {
    public Context context;
    public String appId = "";
    public String appVersion = "";
    public String aid = "";
    public String deviceId = "";
    public String logSdkWebsocketUrl = "";

    public String getAid() {
        return this.aid;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public Context getContext() {
        return this.context;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getLogSdkWebsocketUrl() {
        return this.logSdkWebsocketUrl;
    }
}
