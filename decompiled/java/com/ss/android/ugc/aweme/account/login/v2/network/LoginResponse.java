package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import com.google.gson.internal.s;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class LoginResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final s<String, Object> data;

    @C09CT("message")
    public final String message;

    @C09CT("tnc_data")
    public final s<String, Object> tncData;

    public LoginResponse() {
        this(new s(), "", new s());
    }

    public LoginResponse(s<String, Object> sVar, String str, s<String, Object> sVar2) {
        this.data = sVar;
        this.message = str;
        this.tncData = sVar2;
    }
}
