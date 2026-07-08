package com.ss.android.ugc.aweme.share.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class TTNetErrorData {

    @C09CT("ttnet_error_cause")
    public final String cause;

    @C09CT("ttnet_error_message")
    public final String message;

    public TTNetErrorData() {
        this(null, null);
    }

    public TTNetErrorData(String str, String str2) {
        this.cause = str;
        this.message = str2;
    }
}
