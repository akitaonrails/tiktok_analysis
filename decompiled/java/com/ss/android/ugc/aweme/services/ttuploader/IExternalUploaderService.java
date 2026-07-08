package com.ss.android.ugc.aweme.services.ttuploader;

import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;

/* JADX INFO: loaded from: classes14.dex */
public interface IExternalUploaderService {
    void cacheUploadAuthKeyConfig();

    String getSdkV4AuthKey();

    int getUploadBackupNetworkType();

    int getUploadMainNetworkType();

    ExternalUploadVideoConfig getUploadVideoConfig(String str);
}
