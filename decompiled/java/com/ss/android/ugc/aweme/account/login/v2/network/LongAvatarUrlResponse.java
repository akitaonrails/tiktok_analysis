package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class LongAvatarUrlResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final LongAvatarUrlData data;

    @C09CT("message")
    public final String message;

    public LongAvatarUrlResponse(String str, LongAvatarUrlData longAvatarUrlData) {
        this.message = str;
        this.data = longAvatarUrlData;
    }
}
