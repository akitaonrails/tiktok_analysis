package com.ss.android.ugc.aweme.publish.model;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class CloudEditUploadAuthConfig {

    @C09CT("access_key_id")
    public final String accessKeyId;

    @C09CT("application")
    public final String application;

    @C09CT("current_time")
    public final String currentTime;

    @C09CT("expired_time")
    public final String expireTime;

    @C09CT("host")
    public final String host;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("session_token")
    public final String sessionToken;

    @C09CT("uploader")
    public final String uploader;

    @C09CT("user")
    public final String user;

    public CloudEditUploadAuthConfig() {
        this("", "", "", "", "", "", "", "", "");
    }

    public CloudEditUploadAuthConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expireTime = str4;
        this.currentTime = str5;
        this.host = str6;
        this.user = str7;
        this.uploader = str8;
        this.application = str9;
    }
}
