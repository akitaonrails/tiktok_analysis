package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckNicknameResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public CheckNicknameResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
