package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class UploadUrlBean {

    @C09CT("ip")
    public String ip;

    @C09CT("timeout")
    public int timeout;

    @C09CT("url")
    public String url;

    public String getIp() {
        return this.ip;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
