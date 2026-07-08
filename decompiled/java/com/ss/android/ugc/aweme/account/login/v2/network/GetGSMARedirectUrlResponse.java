package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GetGSMARedirectUrlResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final GetGSMARedirectUrlData data;

    @C09CT("message")
    public final String message;

    public GetGSMARedirectUrlResponse(String str, GetGSMARedirectUrlData getGSMARedirectUrlData) {
        this.message = str;
        this.data = getGSMARedirectUrlData;
    }
}
