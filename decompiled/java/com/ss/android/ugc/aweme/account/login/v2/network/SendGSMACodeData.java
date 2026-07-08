package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SendGSMACodeData implements Serializable {
    public static final int $stable = 0;

    @C09CT("code")
    public final String code;

    @C09CT("error_code")
    public final Integer errorCode;

    public SendGSMACodeData(String str, Integer num) {
        this.code = str;
        this.errorCode = num;
    }
}
