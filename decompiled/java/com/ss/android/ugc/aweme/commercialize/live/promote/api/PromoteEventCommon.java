package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteEventCommon implements Serializable {

    @C09CT("app_id")
    public String appId;

    @C09CT("app_version")
    public String appVersion;

    @C09CT("bid")
    public String bid;

    @C09CT("domain")
    public String domain;

    @C09CT("env")
    public String env;

    @C09CT("os")
    public String os;

    @C09CT("sdk_name")
    public String sdkName;

    @C09CT("session_id")
    public String sessionId;

    @C09CT("user_id")
    public String userId;

    public PromoteEventCommon() {
        this("tiktok_promote_lynx", "www.tiktok.com", "SDK_SLARDAR_WEB", "production", "", "", "", CardStruct.IStatusCode.DEFAULT, "");
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBid() {
        return this.bid;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getEnv() {
        return this.env;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getSdkName() {
        return this.sdkName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setBid(String str) {
        this.bid = str;
    }

    public final void setDomain(String str) {
        this.domain = str;
    }

    public final void setEnv(String str) {
        this.env = str;
    }

    public final void setOs(String str) {
        this.os = str;
    }

    public final void setSdkName(String str) {
        this.sdkName = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public PromoteEventCommon(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.bid = str;
        this.domain = str2;
        this.sdkName = str3;
        this.env = str4;
        this.sessionId = str5;
        this.appId = str6;
        this.appVersion = str7;
        this.os = str8;
        this.userId = str9;
    }
}
