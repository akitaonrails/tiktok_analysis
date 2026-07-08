package com.ss.android.ugc.aweme.request_combine;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class BaseCombineMode {

    @C09CT("content_type")
    public String contentType;

    @C09CT("http_code")
    public int httpCode;

    public final String getContentType() {
        return this.contentType;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setHttpCode(int i) {
        this.httpCode = i;
    }
}
