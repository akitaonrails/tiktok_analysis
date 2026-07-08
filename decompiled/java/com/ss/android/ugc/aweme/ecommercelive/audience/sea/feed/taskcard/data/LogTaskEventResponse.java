package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LogTaskEventResponse {

    @C09CT("code")
    public int code;

    @C09CT("msg")
    public final String message;

    public LogTaskEventResponse() {
        this(-1, "");
    }

    public LogTaskEventResponse(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
