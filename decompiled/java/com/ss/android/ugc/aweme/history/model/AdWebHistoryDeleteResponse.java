package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdWebHistoryDeleteResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AdWebHistoryDeleteResponse() {
        this(null, null);
    }

    public AdWebHistoryDeleteResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
