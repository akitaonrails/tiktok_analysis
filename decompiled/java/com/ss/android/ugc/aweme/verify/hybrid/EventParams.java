package com.ss.android.ugc.aweme.verify.hybrid;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EventParams {

    @C09CT("code")
    public final String code;

    @C09CT("data")
    public final EventData data;

    @C09CT("message")
    public final String message;

    public EventParams(String str, String str2, EventData eventData) {
        this.message = str;
        this.code = str2;
        this.data = eventData;
    }
}
