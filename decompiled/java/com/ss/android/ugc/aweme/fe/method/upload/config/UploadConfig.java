package com.ss.android.ugc.aweme.fe.method.upload.config;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.InterfaceC2126708Uv;

/* JADX INFO: loaded from: classes31.dex */
public final class UploadConfig extends AbstractC2126608Uu {

    @C09CT("authorization2")
    public STSAuthConfig authorizationV2;

    @C09CT("enableHttps")
    public int enableHttps;

    @C09CT("fileRetryCount")
    public int fileRetryCount;

    @C09CT("maxFailTime")
    public int maxFailTime;

    @C09CT("maxFileSize")
    public int maxFileSize;

    @C09CT("sliceRetryCount")
    public int sliceRetryCount;

    @C09CT("sliceSize")
    public int sliceSize;

    @C09CT("sliceTimeout")
    public int sliceTimeout;

    @C09CT("socketNumber")
    public int socketNumber;

    @C09CT("appKey")
    @InterfaceC2126708Uv
    public String appKey = "";

    @C09CT("authorization")
    @InterfaceC2126708Uv
    public String authKey = "";

    @C09CT("videoHostName")
    @InterfaceC2126708Uv
    public String videoHostName = "";

    @C09CT("imageHostName")
    @InterfaceC2126708Uv
    public String imageHostName = "";

    public static final class STSAuthConfig extends AbstractC2126608Uu {

        @C09CT("access_key_id")
        @InterfaceC2126708Uv
        public String accessKeyId;

        @C09CT("secret_access_key")
        @InterfaceC2126708Uv
        public String secretAccessKey;

        @C09CT("session_token")
        @InterfaceC2126708Uv
        public String sessionToken;

        @C09CT("space_name")
        @InterfaceC2126708Uv
        public String spaceName;

        public final String getAccessKeyId() {
            return this.accessKeyId;
        }

        public final String getSecretAccessKey() {
            return this.secretAccessKey;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getSpaceName() {
            return this.spaceName;
        }

        public final void setAccessKeyId(String str) {
            this.accessKeyId = str;
        }

        public final void setSecretAccessKey(String str) {
            this.secretAccessKey = str;
        }

        public final void setSessionToken(String str) {
            this.sessionToken = str;
        }

        public final void setSpaceName(String str) {
            this.spaceName = str;
        }
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthKey() {
        return this.authKey;
    }

    public final STSAuthConfig getAuthorizationV2() {
        return this.authorizationV2;
    }

    public final int getEnableHttps() {
        return this.enableHttps;
    }

    public final int getFileRetryCount() {
        return this.fileRetryCount;
    }

    public final String getImageHostName() {
        return this.imageHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final int getSliceRetryCount() {
        return this.sliceRetryCount;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final int getSocketNumber() {
        return this.socketNumber;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public final void setAppKey(String str) {
        this.appKey = str;
    }

    public final void setAuthKey(String str) {
        this.authKey = str;
    }

    public final void setAuthorizationV2(STSAuthConfig sTSAuthConfig) {
        this.authorizationV2 = sTSAuthConfig;
    }

    public final void setEnableHttps(int i) {
        this.enableHttps = i;
    }

    public final void setFileRetryCount(int i) {
        this.fileRetryCount = i;
    }

    public final void setImageHostName(String str) {
        this.imageHostName = str;
    }

    public final void setMaxFailTime(int i) {
        this.maxFailTime = i;
    }

    public final void setMaxFileSize(int i) {
        this.maxFileSize = i;
    }

    public final void setSliceRetryCount(int i) {
        this.sliceRetryCount = i;
    }

    public final void setSliceSize(int i) {
        this.sliceSize = i;
    }

    public final void setSliceTimeout(int i) {
        this.sliceTimeout = i;
    }

    public final void setSocketNumber(int i) {
        this.socketNumber = i;
    }

    public final void setVideoHostName(String str) {
        this.videoHostName = str;
    }
}
