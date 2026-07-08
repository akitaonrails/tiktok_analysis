package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class PushParams {
    public static final int $stable = 0;

    @C09CT("push_id")
    public final String pushId;

    @C09CT("push_type")
    public final String pushType;

    public PushParams() {
        this("", "");
    }

    public PushParams(String str, String str2) {
        this.pushId = str;
        this.pushType = str2;
    }
}
