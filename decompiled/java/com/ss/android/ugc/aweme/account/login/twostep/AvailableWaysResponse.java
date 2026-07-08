package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AvailableWaysResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final AvailableWaysUserData data;

    @C09CT("message")
    public final String message;

    public AvailableWaysResponse(String str, AvailableWaysUserData availableWaysUserData) {
        this.message = str;
        this.data = availableWaysUserData;
    }
}
