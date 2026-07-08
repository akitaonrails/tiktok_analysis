package com.ss.android.ugc.aweme.account.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountLookupDeviceResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final AccountLookUpData data;

    @C09CT("message")
    public final String message;

    public AccountLookupDeviceResponse(AccountLookUpData accountLookUpData, String str) {
        this.data = accountLookUpData;
        this.message = str;
    }
}
