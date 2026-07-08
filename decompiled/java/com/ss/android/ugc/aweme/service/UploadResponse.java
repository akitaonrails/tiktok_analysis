package com.ss.android.ugc.aweme.service;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class UploadResponse {

    @C09CT("media_info")
    public final String mediaInfo;

    @C09CT("upload_token")
    public final String uploadToken;

    public UploadResponse() {
        this("", "");
    }

    public UploadResponse(String str, String str2) {
        this.uploadToken = str;
        this.mediaInfo = str2;
    }
}
