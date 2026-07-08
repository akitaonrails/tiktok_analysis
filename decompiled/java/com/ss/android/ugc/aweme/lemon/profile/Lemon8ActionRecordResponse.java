package com.ss.android.ugc.aweme.lemon.profile;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class Lemon8ActionRecordResponse {

    @C09CT("data")
    public final Lemon8ActionRecordData data;

    @C09CT("message")
    public final String message;

    public Lemon8ActionRecordResponse() {
        this(null, null);
    }

    public Lemon8ActionRecordResponse(String str, Lemon8ActionRecordData lemon8ActionRecordData) {
        this.message = str;
        this.data = lemon8ActionRecordData;
    }
}
