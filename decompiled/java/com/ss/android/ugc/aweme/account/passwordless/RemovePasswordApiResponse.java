package com.ss.android.ugc.aweme.account.passwordless;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class RemovePasswordApiResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final RemovePasswordData data;

    @C09CT("message")
    public final String message;

    public RemovePasswordApiResponse() {
        this("", null);
    }

    public RemovePasswordApiResponse(String str, RemovePasswordData removePasswordData) {
        this.message = str;
        this.data = removePasswordData;
    }
}
