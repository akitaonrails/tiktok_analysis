package com.bytedance.android.livesdk.comp.impl.event.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveEventSubscribeResponse {

    @C09CT("status_code")
    public final long code;

    @C09CT("status_msg")
    public final String msg;

    public LiveEventSubscribeResponse() {
        this(0L, "");
    }

    public LiveEventSubscribeResponse(long j, String str) {
        this.code = j;
        this.msg = str;
    }
}
