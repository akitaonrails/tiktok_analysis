package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class NotAllowOutreachItemInfo implements Serializable {

    @C09CT("key")
    public final String key;

    @C09CT("reason")
    public final String reason;

    public NotAllowOutreachItemInfo() {
        this(null, null);
    }

    public NotAllowOutreachItemInfo(String str, String str2) {
        this.key = str;
        this.reason = str2;
    }
}
