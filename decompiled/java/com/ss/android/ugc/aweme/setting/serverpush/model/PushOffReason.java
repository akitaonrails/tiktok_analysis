package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class PushOffReason {

    @C09CT("reason_category")
    public final int category;

    @C09CT("reason_text")
    public final String reason;

    public PushOffReason() {
        this(-1, null);
    }

    public PushOffReason(int i, String str) {
        this.category = i;
        this.reason = str;
    }
}
