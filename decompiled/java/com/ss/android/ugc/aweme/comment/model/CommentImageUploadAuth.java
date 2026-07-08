package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class CommentImageUploadAuth implements Serializable {

    @C09CT("configs")
    public List<CommentBaseMediaUploadAuth> config;

    @C09CT("expired_time")
    public long expiredTime;

    @C09CT("log_pb")
    public LogPbBean logPd;

    @C09CT("access_key")
    public String accessKey = "";

    @C09CT("secret_key")
    public String secretKey = "";

    @C09CT("session_token")
    public String sessionToken = "";

    @C09CT("service_id")
    public String serviceId = "";

    @C09CT("upload_domain")
    public String uploadDomain = "";

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final List<CommentBaseMediaUploadAuth> getConfig() {
        return this.config;
    }

    public final long getExpiredTime() {
        return this.expiredTime;
    }

    public final LogPbBean getLogPd() {
        return this.logPd;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getUploadDomain() {
        return this.uploadDomain;
    }

    public final void setAccessKey(String str) {
        this.accessKey = str;
    }

    public final void setConfig(List<CommentBaseMediaUploadAuth> list) {
        this.config = list;
    }

    public final void setExpiredTime(long j) {
        this.expiredTime = j;
    }

    public final void setLogPd(LogPbBean logPbBean) {
        this.logPd = logPbBean;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setServiceId(String str) {
        this.serviceId = str;
    }

    public final void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public final void setUploadDomain(String str) {
        this.uploadDomain = str;
    }
}
