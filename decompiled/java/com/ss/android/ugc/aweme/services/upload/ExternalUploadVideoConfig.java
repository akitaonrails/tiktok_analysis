package com.ss.android.ugc.aweme.services.upload;

/* JADX INFO: loaded from: classes14.dex */
public final class ExternalUploadVideoConfig {
    public final String appKey;
    public final String authorization;
    public final String fileHostName;
    public final int maxFailTime;
    public final int sliceSize;
    public final int sliceTimeout;
    public final String spaceName;
    public final String topAccessKey;
    public final String topSecretKey;
    public final String topSessionToken;
    public final String videoHostName;

    public ExternalUploadVideoConfig() {
        this(0, 0, "", "", 0, "", "", "", "", "", "");
    }

    public ExternalUploadVideoConfig(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.maxFailTime = i;
        this.sliceSize = i2;
        this.fileHostName = str;
        this.videoHostName = str2;
        this.sliceTimeout = i3;
        this.appKey = str3;
        this.authorization = str4;
        this.topAccessKey = str5;
        this.topSecretKey = str6;
        this.topSessionToken = str7;
        this.spaceName = str8;
    }
}
