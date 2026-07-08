package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GSMAStatusResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final GSMAStatusData data;

    @C09CT("message")
    public final String message;

    public GSMAStatusResponse(String str, GSMAStatusData gSMAStatusData) {
        this.message = str;
        this.data = gSMAStatusData;
    }
}
