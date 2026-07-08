package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes35.dex */
public interface IVopCameraClientService {
    String genVopSdkSavePath();

    String getCurrentUserId();

    String getSDKVersion();

    String getUserTTToken();

    void initDownloadableModel();

    void initVESdk();
}
