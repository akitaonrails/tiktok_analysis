package com.ss.android.ugc.aweme.services.ttuploader;

import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;

/* JADX INFO: loaded from: classes14.dex */
public final class UploadResult {
    public final ExternalUploadVideoConfig config;
    public final String error;
    public final boolean success;
    public final String tosKey;

    public UploadResult(boolean z, String str, String str2, ExternalUploadVideoConfig externalUploadVideoConfig) {
        this.success = z;
        this.error = str;
        this.tosKey = str2;
        this.config = externalUploadVideoConfig;
    }
}
