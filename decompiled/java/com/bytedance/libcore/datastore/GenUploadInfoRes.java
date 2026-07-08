package com.bytedance.libcore.datastore;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GenUploadInfoRes {

    @C09CT("status_code")
    public int code;

    @C09CT("message")
    public String message = "";

    @C09CT("access_key")
    public String accessKey = "";

    @C09CT("secret_access_key")
    public String secretKey = "";

    @C09CT("space_name")
    public String spaceName = "";

    @C09CT("session_token")
    public String session = "";

    @C09CT("domain")
    public String domain = "";

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getSpaceName() {
        return this.spaceName;
    }

    public final void setAccessKey(String str) {
        this.accessKey = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDomain(String str) {
        this.domain = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSession(String str) {
        this.session = str;
    }

    public final void setSpaceName(String str) {
        this.spaceName = str;
    }
}
