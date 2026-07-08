package com.ss.android.ugc.aweme.uploader.retrofit;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UploadAbSettingsResp {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public UploadAbSettingsResp() {
        this(0, "");
    }

    public UploadAbSettingsResp(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
