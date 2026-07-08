package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinUploadAuthKeyResponse {

    @C09CT("access_key_id")
    public final String accessKey;

    @C09CT("current_time")
    public final long currentTime;

    @C09CT("expired_time")
    public final long expiredTime;

    @C09CT("resource_space")
    public final String resourceSpace;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("service_id")
    public final String serviceId;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("session_token")
    public final String token;

    @C09CT("upload_domain")
    public final String uploadDomain;

    @C09CT("upload_host")
    public final String uploadHost;

    public BulletinUploadAuthKeyResponse(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8) {
        this.statusCode = i;
        this.statusMsg = str;
        this.accessKey = str2;
        this.secretAccessKey = str3;
        this.token = str4;
        this.expiredTime = j;
        this.currentTime = j2;
        this.serviceId = str5;
        this.uploadDomain = str6;
        this.resourceSpace = str7;
        this.uploadHost = str8;
    }
}
