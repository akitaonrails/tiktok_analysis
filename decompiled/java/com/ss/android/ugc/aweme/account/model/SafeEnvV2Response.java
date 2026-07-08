package com.ss.android.ugc.aweme.account.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class SafeEnvV2Response {

    @C09CT("data")
    public final SafeEnvData data;

    @C09CT("message")
    public final String message;

    public SafeEnvV2Response(String str, SafeEnvData safeEnvData) {
        this.message = str;
        this.data = safeEnvData;
    }
}
