package com.ss.mediakit.image;

/* JADX INFO: loaded from: classes35.dex */
public interface IMIOImageClient {
    IMIOImageRequest createImageRequest(MIOImageTaskConfig mIOImageTaskConfig);

    boolean isMIORunning();

    void setPreDNS(String str, String str2, long j);
}
