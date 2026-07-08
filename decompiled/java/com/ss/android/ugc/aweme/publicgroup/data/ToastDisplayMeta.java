package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ToastDisplayMeta {

    @C09CT("status_code")
    public final long statusCode;

    @C09CT("text")
    public final String text;

    public ToastDisplayMeta() {
        this("", 0L);
    }

    public ToastDisplayMeta(String str, long j) {
        this.text = str;
        this.statusCode = j;
    }
}
