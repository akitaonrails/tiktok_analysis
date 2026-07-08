package com.ss.android.ugc.aweme.fe.method.upload.config;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.InterfaceC2126708Uv;

/* JADX INFO: loaded from: classes20.dex */
public final class UploadAuthConfig extends AbstractC2126608Uu {

    @C09CT("code")
    @InterfaceC2126708Uv
    public int code;

    @C09CT("data")
    public UploadConfig config;

    @C09CT("message")
    @InterfaceC2126708Uv
    public String message = "";

    public final int getCode() {
        return this.code;
    }

    public final UploadConfig getConfig() {
        return this.config;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UploadConfig getUploadConfig() {
        return this.config;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setConfig(UploadConfig uploadConfig) {
        this.config = uploadConfig;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
